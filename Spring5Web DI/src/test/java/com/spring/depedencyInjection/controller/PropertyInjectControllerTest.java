package com.spring.depedencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.depedencyInjection.service.ConstructorGreetingServiceImpl;

class PropertyInjectControllerTest {

	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setup()
	{
		propertyInjectedController=new PropertyInjectedController();
		propertyInjectedController.greetingService=new ConstructorGreetingServiceImpl();
	}

	@Test
	void getGreetings() {
		System.out.println(propertyInjectedController.getGreetings());
	}

}
