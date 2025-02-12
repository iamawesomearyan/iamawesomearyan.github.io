package com.example.valentines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ValentinesApplication {

	public static void main(String[] args) {
		//DBService dbService = new DBService();
		//dbService.addData("Cool");

		//ApplicationContext context = SpringApplication.run(ValentinesApplication.class, args);
		SpringApplication.run(ValentinesApplication.class, args);
		//DBService dbService = context.getBean(DBService.class);
		//dbService.addData("cool");
		System.out.println("Cool");
	}


}
