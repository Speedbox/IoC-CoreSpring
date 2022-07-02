package com.example.Ioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIocApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		
		Vodaphone vphone= (Vodaphone) context.getBean("airtel",Vodaphone.class);
		vphone.calling();
		vphone.data();
	}

}
