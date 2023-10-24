package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.config.MessageConfig;
import com.dto.OrderStatus;
@Component
public class Consumer {
	@RabbitListener(queues = MessageConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue "+orderStatus);
	}
}
