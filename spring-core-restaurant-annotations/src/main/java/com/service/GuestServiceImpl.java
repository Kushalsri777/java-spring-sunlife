package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.Restaurant;

@Service("service")
public class GuestServiceImpl implements GuestService
{

	@Autowired
	@Qualifier("american")
	private Restaurant restaurant;
	
	
	public GuestServiceImpl(Restaurant r) 
	{
		super();
		this.restaurant=r;
	}


	@Override
	public void inRoomDining(String order) 
	{
		System.out.println(restaurant.prepareDish(order));
	}
	public GuestServiceImpl() {
		
	}

}