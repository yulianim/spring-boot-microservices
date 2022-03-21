package com.example.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.bean.Limits;

@RestController
public class LimistsController {
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(1, 1000);
	}

}
