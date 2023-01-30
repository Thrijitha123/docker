package com.example.doc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocController {
	@RequestMapping("/")
	String helloWorld() {
		return "Hello World";
	}

}
