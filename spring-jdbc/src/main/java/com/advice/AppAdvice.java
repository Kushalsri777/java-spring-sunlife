package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(2)
public class AppAdvice {
	@Before("execution(* com.dao.ProjectDAO.addProjectToEmp(..))")
	public void callBefore() {
		System.out.println("Called before addProjectToEmp");
	}
	
	@After("execution(* com.dao.ProjectDAO.addProjectToEmp(..))")
	public void callAfter() {
		System.out.println("Called after addProjectToEmp");
	}
}	
