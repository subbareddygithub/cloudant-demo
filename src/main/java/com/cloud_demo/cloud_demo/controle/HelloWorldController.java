package com.cloud_demo.cloud_demo.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}

}
