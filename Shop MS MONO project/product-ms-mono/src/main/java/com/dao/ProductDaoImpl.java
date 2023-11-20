package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Product;
import com.repo.ProductREPO;

@Repository
public class ProductDaoImpl implements ProductDAO{
	
	@Autowired
	ProductREPO productRepo;
	
	List<Product> al = new ArrayList<>();

	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		System.out.println("Product Added");
		return product;
	}

	@Override
	public List<Product> loadProducts() {
		
		return (List<Product>) productRepo.findAll();
	}

	@Override
	public List<Product> getByIds(List<Long> plist) {

		return (List<Product>) productRepo.findAllById(plist);
	}

}
