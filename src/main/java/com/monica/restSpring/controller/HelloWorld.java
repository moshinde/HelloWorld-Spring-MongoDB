package com.monica.restSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monica.restSpring.model.HelloWorldBean;
import com.monica.restSpring.service.HelloWorldService;

@RestController
public class HelloWorld {

	@Autowired
	public HelloWorldService service;
	
	@GetMapping("/Hello-World")
	public String greet() {
		return "Hello World";	
	}
	
	@PostMapping("/add")
	public HelloWorldBean addBean(@RequestBody HelloWorldBean bean) {
		 return service.createMsg(bean);
	}
}
