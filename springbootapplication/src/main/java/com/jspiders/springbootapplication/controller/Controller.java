package com.jspiders.springbootapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/get")
	public String map() {
		return "java";
	}

}
