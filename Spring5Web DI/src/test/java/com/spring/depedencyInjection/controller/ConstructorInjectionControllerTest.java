package com.spring.depedencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.depedencyInjection.service.ConstructorGreetingServiceImpl;

class ConstructorInjectionControllerTest {

	ConstructorInjectionController constructorInjectionController;
	@BeforeEach
	void setUp() {
		constructorInjectionController=new ConstructorInjectionController(new ConstructorGreetingServiceImpl());
	}

	@Test
	void testGetGreetings() {
		System.out.println(constructorInjectionController.getGreetings());
	}

}
