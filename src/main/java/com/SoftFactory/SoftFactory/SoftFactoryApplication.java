package com.SoftFactory.SoftFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SoftFactoryApplication {

	@GetMapping("/hello")
	public String hello(){
		return "hola Mundo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SoftFactoryApplication.class, args);
	}

}
