package com.spring.depedencyInjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService
{

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Hello World- From the Primary Bean";
	}

}
