package com.example.oktaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class AppController {
	
	@GetMapping("/loaduser")
	public String loaddata() {
		return "User is Accessable....!";
	}
}
