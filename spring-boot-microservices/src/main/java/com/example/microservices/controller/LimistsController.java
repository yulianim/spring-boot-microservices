package com.example.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.bean.Limits;
import com.example.microservices.configuration.Configuration;

@RestController
public class LimistsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		//return new Limits(1, 1000);
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
