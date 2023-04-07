package com.spring.depedencyInjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.depedencyInjection.service.GreetingService;

@Controller
public class ProfileGreetingController {

	private GreetingService greetingService;

	public ProfileGreetingController( @Qualifier("profileGreeting")  GreetingService greetingService) {
		this.greetingService = greetingService;
	}
     
	public String sayHello()
	{
		return greetingService.sayGreetings();
	}
}
