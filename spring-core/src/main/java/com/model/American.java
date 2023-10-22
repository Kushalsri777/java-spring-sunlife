package com.model;

public class American implements Restaurant
{

	@Override
	public String prepareDish(String order) 
	{
		return order+" is getting prepared in American style";
	}

}