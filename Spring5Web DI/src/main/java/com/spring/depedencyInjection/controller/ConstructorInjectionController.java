package com.spring.depedencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.depedencyInjection.service.GreetingService;

@Controller
public class ConstructorInjectionController 
{
	
	private GreetingService greetingService;
   
	// @Autowired :   See Comment 3
	
	/*
	 We don't have to tell spring explicitly to utilize the constructor , Hence its
	 automatically  going to autowire. we don't have to provide the autowire annotation. 
	   */
	public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreetings()
	{
		return greetingService.sayGreetings();
	}

}
