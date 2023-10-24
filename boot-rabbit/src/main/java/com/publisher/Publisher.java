package com.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.MessageConfig;
import com.dto.OrderStatus;
import com.dto.Orders;

@RestController
@RequestMapping("/order")
public class Publisher {
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{restName}")
	public String bookOrder(@RequestBody Orders orders, @PathVariable String restName) {
		orders.setOrderId(UUID.randomUUID().toString());
		OrderStatus orderStatus = new OrderStatus(orders, "Process", "Order Placed Successfully in "+restName);
		template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, orderStatus);
		return "SUCCESS...!";
	}
}
