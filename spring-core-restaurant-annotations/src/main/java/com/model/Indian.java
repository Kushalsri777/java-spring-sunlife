package com.model;

import org.springframework.stereotype.Component;

@Component("indian")

public class Indian implements Restaurant
{

	@Override
	public String prepareDish(String order) 
	{
		return order+" is getting prepared in Indian style";
	}

}