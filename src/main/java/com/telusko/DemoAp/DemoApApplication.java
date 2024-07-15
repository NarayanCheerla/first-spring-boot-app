package com.telusko.DemoAp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
