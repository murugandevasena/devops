package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

	@GetMapping("/get")
	public String getHello() {
		return "World is full of muruga!";
	}
}
