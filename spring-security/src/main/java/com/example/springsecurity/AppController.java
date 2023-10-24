package com.example.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

	@GetMapping("/welcome")
	public String sayWelcome()
	{
		return "Welcome";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "admin";
	}
	
	@GetMapping("/manager")
	public String manager()
	{
		return "manager";
	}
	
	@GetMapping("/emp")
	public String emp()
	{
		return "emp";
	}
	
	@GetMapping("/common")
	public String common()
	{
		return "common";
	}
	
	@GetMapping("/ad")
	public String ad()
	{
		return "accessdenied";
	}
	
	@GetMapping("/sv")
	public String sv()
	{
		return "sv";
	}
	
	@GetMapping("/sa")
	public String sa()
	{
		return "sa";
	}
	
	@GetMapping("/mainapp")
	public String mainapp()
	{
		return "mainapp";
	}
}
