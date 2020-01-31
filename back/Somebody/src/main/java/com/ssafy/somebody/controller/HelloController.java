package com.ssafy.somebody.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String Hello() {
		System.out.println("왜안되냐고");
		return "Hello";
	}
}
