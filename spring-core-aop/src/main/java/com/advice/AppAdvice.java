package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AppAdvice {
	@Before("execution(* com.model.Welcome.sayWelcome(..))")
	public void callBefore() {
		System.out.println("Called before welcome");
	}
	
	@After("execution(* com.model.Welcome.sayHi(..))")
	public void callAfter() {
		System.out.println("Called after hi");
	}
}	
