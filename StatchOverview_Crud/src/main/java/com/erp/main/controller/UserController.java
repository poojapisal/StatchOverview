package com.erp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.erp.main.model.User;
import com.erp.main.service.UserService;

@RestController
public class UserController 
{

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public String saveData(@RequestBody User user)
	{
		userService.saveData(user);
		
		return "data saved";
	}
	@GetMapping("/getAll")
	public Iterable<User> getAllData()
	
	{
	
		return userService.getAllData();

	
	}
	
	@GetMapping("/getById/{userId}")
	public ResponseEntity<User> getDataById(@PathVariable int userId)
	{
		User u =userService.getUserData(userId);
		return new ResponseEntity<User>(u, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletData/{userId}")
	public String deleteUserData(@PathVariable int userId)
	{
		userService.deleteUser(userId);
		return "Data Deleted";

	}

}
