package com.example.demo_dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoDpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDpApplication.class, args);
	}

	@GetMapping("/test")
	public String test_dp() {
		return "test";
	}

}
