package com.gcm.lunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LunchApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Lunch app is working !";
	}

}
