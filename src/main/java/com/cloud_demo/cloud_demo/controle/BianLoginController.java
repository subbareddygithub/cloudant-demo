package com.cloud_demo.cloud_demo.controle;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud_demo.cloud_demo.model.BianLoginRequest;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class BianLoginController {
	
	@PostMapping("/login")
	public String validateLoginDetails(@RequestBody BianLoginRequest bianLoginRequest) {
		System.out.println("Validate Customer " + bianLoginRequest);

		return "true";
	}

}
