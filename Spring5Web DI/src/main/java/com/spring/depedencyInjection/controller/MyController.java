package com.spring.depedencyInjection.controller;

import org.springframework.stereotype.Controller;

import com.spring.depedencyInjection.service.GreetingService;

@Controller
public class MyController {
        
	private final GreetingService greetingService;
	
	// For Constructor injected controller , there is no need for autowire and also no need for qualifier
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreetings()
	{
		return greetingService.sayGreetings();
	}
}
