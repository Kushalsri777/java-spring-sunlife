package com.model;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xml_less_annotation.AppContext;

public class Client {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

		Welcome wi = (WelcomeImpl)ctx.getBean("welcome");
		System.out.println(wi.sayWelcome(" Kushal "));
		wi.sayHi(" Kushal ");

		
	}
}
