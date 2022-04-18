package com.sportyshoes.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SportyShoesPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesPrototypeApplication.class, args);
		System.out.println("User Registred Successfully!");
		System.out.println("Open - http://localhost:8050/swagger-ui.html");
	}

}
