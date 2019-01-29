package com.cg.rabbit.messagingsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
@SpringBootApplication
public class MessagingSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingSenderApplication.class, args);
	}
	
	@Bean
	public Queue queue() {
		return new Queue("CustomerQ", false);

	}

}

