package com.model;

import java.util.List;

import com.model.Product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShoppingcartResponse {
	private Long userId;
	private Long cartId;
	private Integer totalItems;
	private Double totalCosts;
	private List<Product>products;
}
