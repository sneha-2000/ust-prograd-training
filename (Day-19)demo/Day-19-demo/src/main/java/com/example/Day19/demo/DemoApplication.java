package com.example.Day19.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(Arrays.asList(context.getBeanDefinitionNames()));
	}

}
