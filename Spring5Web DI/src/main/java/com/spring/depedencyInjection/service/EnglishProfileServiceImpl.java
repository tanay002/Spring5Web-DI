package com.spring.depedencyInjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "EN")
@Service(value = "profileGreeting")
public class EnglishProfileServiceImpl implements GreetingService {

	@Override
	public String sayGreetings() {

		return "Hello All.. WonderFull Morning";
	}

}
