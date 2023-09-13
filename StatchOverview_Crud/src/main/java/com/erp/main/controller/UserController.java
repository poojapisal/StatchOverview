package com.erp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.main.model.User;
import com.erp.main.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	UserService us;
	
	@PostMapping("/save")
	public String saveData(@RequestBody User user)
	{
		us.saveData(user);
		
		return "data saved";
	}
	@GetMapping("/getAll")
	public Iterable<User> getAllData()
	
	{
	
		return us.getAllData();
	}

}
