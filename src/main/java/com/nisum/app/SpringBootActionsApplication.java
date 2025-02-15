package com.nisum.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootActionsApplication {
	@GetMapping("/actions")
	public String helloActionsMethod(){
		return "Wel come to Actions CI/CD Pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActionsApplication.class, args);
	}

}
