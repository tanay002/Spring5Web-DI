package com.spring.depedencyInjection.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean,DisposableBean,BeanNameAware,
BeanFactoryAware,ApplicationContextAware
{
	public LifeCycleDemoBean()
	{
		System.out.println("I m in Life Cycle Bean Constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context Has been set");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		System.out.println("Bean Factory Has been set");	
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("My Bean Name is "+name);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Lifecycle has been terminated");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The lifecycle bean its property set");

	}
     
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("The post Constructed annotated method has been called");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("The Pre Destroy annotated method has been called");
	}
}
