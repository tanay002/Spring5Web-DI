package com.spring.depedencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.depedencyInjection.service.GreetingService;

@Controller //1 If removed :- No qualifying bean of type 'com.spring.depedencyInjection.controller.PropertyInjectedController' available
public class PropertyInjectedController {
     
	@Qualifier("propertyGreetingServiceImpl")
	@Autowired  //2 If removed  Cannot invoke "com.spring.depedencyInjection.service.GreetingService.sayGreetings()" because "this.greetingService" is null
	
	/*  On the property injected controller,we have to tell spring explicitly that we want spring to
	  go ahead and manage the injection of a greeting service*/
	public GreetingService greetingService;
	
	public String getGreetings()
	{
		return greetingService.sayGreetings();
	}
}
