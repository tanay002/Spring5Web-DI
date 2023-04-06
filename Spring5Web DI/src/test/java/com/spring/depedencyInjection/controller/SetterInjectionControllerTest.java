package com.spring.depedencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.depedencyInjection.service.GreetingService;
import com.spring.depedencyInjection.service.ConstructorGreetingServiceImpl;

class SetterInjectionControllerTest {

	SetterInjectionController setterInjectionController;
	
	@BeforeEach
	void setUp() {
		setterInjectionController =new SetterInjectionController();
		setterInjectionController.setGreetingService(new ConstructorGreetingServiceImpl());
	}

	@Test
	void testGetGreetings() {
		System.out.println(setterInjectionController.getGreetings());
		
	}

}
