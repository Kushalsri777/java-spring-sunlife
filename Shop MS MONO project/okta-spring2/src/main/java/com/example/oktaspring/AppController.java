package com.example.oktaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure2")
public class AppController {
	
	@GetMapping("/loaduser2")
	public String loaddata() {
		return "Second User is also Accessable....!";
	}
}
