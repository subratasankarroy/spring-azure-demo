package com.hackathon.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppHackathonApplication {

  @GetMapping("/message")
  public String message() {
    return "Deployed successfully in Azure!!";
  }
  
	public static void main(String[] args) {
		SpringApplication.run(DemoAppHackathonApplication.class, args);
		System.out.println("Hello...");
	}

}
