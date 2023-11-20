package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;
import com.model.Users;


@RestController   
@RequestMapping("/userapp")
public class AppController {
	
	@Autowired
	private UserDao userDAO;
	
	
	@GetMapping("/getAllUsers")
	public Users getAllUsers() { //throws InterruptedException{
//		Thread.sleep(20);
		return userDAO.getAllUsers();	
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@RequestBody User u){
		Integer id = userDAO.getAllUsers().getUsers().size()+1;
		u.setuId(id);
		userDAO.addUser(u);
		return ResponseEntity.ok("user added");
	}
//	
//	@GetMapping("/findUser/{uname}")
//	public User findTheUser(@PathVariable()int uname) {
//		User user = userDAO.findUser(uname);
//		return user;
//	}
//	
//	@DeleteMapping("/deleteUser/{uname}")
//	public String deleteTheUser(@PathVariable()String uname) {
//		boolean deleted = userDAO.deleteUser(uname);
//		if(deleted == true) {
//			return "User Deleted";
//		}
//		return "User not found";
//	}
//	
//	@PutMapping("/updateUser/{uname}")
//	public String updateUser(@PathVariable()String uname, @RequestBody User u) {
//		if(userDAO.updateUser(uname, u)) {
//			return uname+"found";
//		}
//		return uname;
//	}
	
//	@RequestMapping(value="/kushal",method=RequestMethod.POST)
//	@PostMapping("/kushal")
//	@ResponseBody
//	public String loginValid(@ModelAttribute User u) {
//		for(User i : al) {
//			if(i.getUname().equals(u.getUname()) && i.getPassword().equals(u.getPassword())) {
//				return "Login Successfull";
//			}
//		}
//		return "Login Failure...";
//	}
	
	
	
//	@RequestMapping(value="/registeration",method=RequestMethod.POST)
//	@PostMapping("registeration")
//	@ResponseBody
//	public String registerToUser(@RequestParam("uname")String uname, @RequestParam("password")String pass, @RequestParam("city")String city, @RequestParam("email")String email) {
//	public String registerToUser(@ModelAttribute User u) {
//
////		al.add(new User(uname, pass, city, email));
//		al.add(u);
//		System.out.println(al);
//		return "User Added";
//	}
	
	
}
