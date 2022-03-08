package com.example.HelloUST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUstApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloUstApplication.class, args);
		System.out.println("Hello and welcome to Spring");

	}

}
//Create a simple spring boot application using spring initializer
// and display the count of beans defined in the factory and
// to display the name of all the beans in the factory
