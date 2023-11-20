package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.entity.CartEntity;

public interface ShopRepo extends CrudRepository<CartEntity, Long>{

}
