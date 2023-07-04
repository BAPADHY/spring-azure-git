package com.cg.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureGitApplication {
	
	@GetMapping("/message")
	public String message() {
		return "azure is working";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureGitApplication.class, args);
	}

}
