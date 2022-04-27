package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class helloWorld {
	
	@GetMapping
	public String hello() {
		return "Hello World Kamila!!!";
	}

}
