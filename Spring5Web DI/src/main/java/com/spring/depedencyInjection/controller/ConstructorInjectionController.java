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
	 automatically  going to autowire. we don't have to provide the autowire and qualifier annotation. 
	  
	   In case of Primary annotation also , we doesn't need to provide autowire and qualifier 
	   so we can comment below piece of codes.  @Qualifier("constructorGreetingServiceImpl")
	   
	   
	   */
	

	public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl")  GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreetings()
	{
		return greetingService.sayGreetings();
	}

}
