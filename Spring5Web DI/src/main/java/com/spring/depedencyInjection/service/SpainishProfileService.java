package com.spring.depedencyInjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "SPN")
@Service(value = "profileGreeting") //("profileGreeting")
public class  SpainishProfileService implements GreetingService { 
 
	@Override
	public String sayGreetings() {
		return "Hola a todos. Maravillosa mañana llena";
	}

}
