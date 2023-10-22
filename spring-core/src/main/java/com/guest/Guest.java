package com.guest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.GuestService;

public class Guest {
	public static void main(String[] args) {
		//loading the container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		GuestService gs = (GuestService)ctx.getBean("service");
		gs.inRoomDining("dosa");
	}
}
