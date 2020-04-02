package com.example.myproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.model.entity.User;
import com.example.myproject.service.UserService;
@RestController
public class HelloWorldController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public List<User> GetUser() {
		User user = new User();
		user.setName("zjt");
		List<User> a =  userService.findAll();
		return a;
	}
}
