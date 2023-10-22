package com.model;

import org.springframework.stereotype.Component;

@Component("welcome")
public class WelcomeImpl implements Welcome{
	
	@Override
	public String sayWelcome(String name) {
		return "welcome" + name + "to AOP";
	}

	@Override
	public void sayHi(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hi " + name + ", welcome to AOP");

		
	}
}
