package com.springrest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.restapi.entities.User;
import com.springrest.restapi.services.UserService;


@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home";
	}
	
	@GetMapping("/users")
	public List<User> users()
	{
		return this.userService.getUsers();
	}
}
