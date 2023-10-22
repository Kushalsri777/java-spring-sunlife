package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainapp")
public class ResController {
//	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to Spring MVC";
	}
	
//	@RequestMapping(value="/kushal",method=RequestMethod.GET)
	@GetMapping("/kushal")
//	@ResponseBody
	public String isLogin() {
		return "Login";
	}
	
//	@RequestMapping(value="/registeration",method=RequestMethod.GET)
	@GetMapping("/registeration")
//	@ResponseBody
	public String Register() {
		return "Register";
	}
	
//	@GetMapping("/loadall")
//	@ResponseBody
//	public String loadAll() {
//		return "loadAll";
//	}
}
