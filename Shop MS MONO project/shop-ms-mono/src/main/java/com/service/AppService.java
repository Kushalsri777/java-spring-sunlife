package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.entity.CartEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Product;
import com.model.ShoppingCartRequest;
import com.model.ShoppingcartResponse;
import com.repo.ShopRepo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class AppService {
	@Autowired
	@Qualifier("webclient")
	private WebClient.Builder builder;
	
	@Autowired
	private ShopRepo repo;
	
	@CircuitBreaker(fallbackMethod = "fallBackMthd", name = "cb")
	public ShoppingcartResponse  processAndSend(Long userId, List<ShoppingCartRequest> shoppingCartRequests) {
		ObjectMapper mapper= new ObjectMapper();
		String productServiceURL="http://product-service/mainapp/loadProducts/"+ shoppingCartRequests.stream()
		.map(e ->String.valueOf(e.getProductId())).collect(Collectors.joining(","));
		
		List<Product> productServiceList= builder.build()
				.get()
				.uri(productServiceURL)
				.retrieve()
				.bodyToFlux(Product.class)
				.collectList()
				.block();
		System.out.println(productServiceURL);
		System.out.println(productServiceList);
		
		//calculate the total cost
		Double [] totalcost = {0.0};
		productServiceList.forEach(psl ->{
			shoppingCartRequests.forEach(cr ->{
				if(psl.getProductId()==cr.getProductId()) {
					psl.setQuantity(cr.getQuantity());
					totalcost[0] = totalcost[0] + psl.getPrice() * cr.getQuantity();
				}
			});
		});
		
		//create cart entity
		CartEntity cartEntity = null;
		try {
			cartEntity = CartEntity.builder()
					.userId(userId)
					.cartId((long)(Math.random()*Math.pow(10, 10)))
					.totalItems(productServiceList.size())
					.totalCosts(totalcost[0])
					.products(mapper.writeValueAsString(productServiceList))
					.build();
			cartEntity = repo.save(cartEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//return response
		ShoppingcartResponse res= ShoppingcartResponse.builder()
				.cartId(cartEntity.getCartId())
				.userId(cartEntity.getUserId())
				.totalItems(cartEntity.getTotalItems())
				.totalCosts(cartEntity.getTotalCosts())
				.products(productServiceList)
				.build();
		return res;
		
	
	}
	public ShoppingcartResponse fallBackMthd(Throwable t) {
		System.out.println("Service is Down...! Please try again");
		return null;
	}
}
