package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.InsuranceService;
import com.xml_less_annotation.AppContext;
public class Customer {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		InsuranceService is = (InsuranceService)ctx.getBean("service");
		InsuranceService is2 = (InsuranceService)ctx.getBean("service");

		System.out.println(is.premiumValue(34));
		ctx.close();
	}
}
