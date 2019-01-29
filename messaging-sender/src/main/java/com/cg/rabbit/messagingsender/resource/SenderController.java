package com.cg.rabbit.messagingsender.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rabbit.messagingsender.sender.Sender;

@RestController
public class SenderController {
	
	@Autowired
	private Sender sender;
	
	@GetMapping
	public void send() {
		sender.send("shabzan");
		
	}
	

}
