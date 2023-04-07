package com.spring.depedencyInjection.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor
{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if(bean instanceof LifeCycleDemoBean)
		{
			System.out.println("Before Init of Bean Name "+beanName);
		}

		return bean;
	}

	public  Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		{
			if(bean instanceof LifeCycleDemoBean)
			{
				System.out.println("After Init of Bean Name "+beanName);
			}
			return bean;

		}
	}
}
