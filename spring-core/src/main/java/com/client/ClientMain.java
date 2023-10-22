package com.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.account.Account;
import com.service.GuestService;

import accountModel.AccountService;

public class ClientMain {
	public static void main(String[] args) {
		//loading the container
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("account.xml");
		Account as = (Account)ctx.getBean("current");
		Account as2 = (Account)ctx.getBean("savings");

		System.out.println(as);
		System.out.println(as2);
		ctx.close();
	}
}
