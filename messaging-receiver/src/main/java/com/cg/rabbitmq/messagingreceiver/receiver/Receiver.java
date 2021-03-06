package com.cg.rabbitmq.messagingreceiver.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@RabbitListener(queues = "CustomerQ")
	public void processMessage(String message) {
		System.out.println(message);
}
}