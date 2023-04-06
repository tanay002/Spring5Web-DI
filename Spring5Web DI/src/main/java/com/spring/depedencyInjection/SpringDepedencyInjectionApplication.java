package com.spring.depedencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.depedencyInjection.controller.ConstructorInjectionController;
import com.spring.depedencyInjection.controller.MyController;
import com.spring.depedencyInjection.controller.PropertyInjectedController;
import com.spring.depedencyInjection.controller.SetterInjectionController;

@SpringBootApplication
public class SpringDepedencyInjectionApplication {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(SpringDepedencyInjectionApplication.class, args);
    MyController myc=	ac.getBean(MyController.class);
    System.out.println(myc.getGreetings());
    
    PropertyInjectedController proInjectedController=ac.getBean(PropertyInjectedController.class);
    System.out.println(proInjectedController.getGreetings());
    
    SetterInjectionController setterInjectionController=ac.getBean(SetterInjectionController.class);
    System.out.println(setterInjectionController.getGreetings());
   
    
    /* Comment 3
      Spring will automatically detech it and inject in an instance of the greeting
    service into our constructor without having to specify an autowire annotation */
    ConstructorInjectionController constructorInjectionController=ac.getBean(ConstructorInjectionController.class);
    System.out.println(constructorInjectionController.getGreetings());
	}

}
