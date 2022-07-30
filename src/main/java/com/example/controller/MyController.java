package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test")
	public String getMessage() {
		return "Docker example of java spring boot with kubernetes deployed using jenkins CI/CD";
	}
}
