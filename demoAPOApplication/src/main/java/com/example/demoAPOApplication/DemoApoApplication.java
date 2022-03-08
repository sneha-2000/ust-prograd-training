package com.example.demoAPOApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(DemoApoApplication.class, args);
	Student student = context.getBean(Student.class);
	student.show(2);
	student.showAvg(0);
	student.notShown();
	student.shown();

	}

}
