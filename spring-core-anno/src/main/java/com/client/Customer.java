package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.InsuranceService;
public class Customer {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		InsuranceService is = (InsuranceService)ctx.getBean("service");
		InsuranceService is2 = (InsuranceService)ctx.getBean("service");

		System.out.println(is.premiumValue(34));
		ctx.close();
	}
}
