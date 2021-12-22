package com.example.CountBeanApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CountBeanApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(CountBeanApplication.class, args);
		int count=context.getBeanDefinitionCount();
		System.out.println(count);

		String[] allBeanNames = context.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}

}
