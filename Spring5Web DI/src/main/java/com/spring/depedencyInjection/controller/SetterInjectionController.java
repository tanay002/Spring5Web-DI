package com.spring.depedencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.depedencyInjection.service.GreetingService;

@Controller
public class SetterInjectionController 
{

	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}
	
	@Qualifier("setterGreetingServiceImpl")
	@Autowired
	/* We have to tell spring explicitly that we wan the setter  to be used for the 
	 dependency */
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreetings()
	{
		return greetingService.sayGreetings();
	}

}
