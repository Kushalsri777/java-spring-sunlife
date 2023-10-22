package com.guest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.GuestService;
import com.xml_less_annotation.AppContext;

public class Guest {
	public static void main(String[] args) {
		//loading the container
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

		GuestService gs = (GuestService)ctx.getBean("service");
		gs.inRoomDining("dosa");
	}
}
