package com.spring.depedencyInjection.service;

import org.springframework.stereotype.Service;

 /*3 If Removed  Field greetingService in com.spring.depedencyInjection.controller.PropertyInjectedController required a bean of type 'com.spring.depedencyInjection.service.GreetingService' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true) */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello ,Constructor Good Morning...!!";
	}

}
