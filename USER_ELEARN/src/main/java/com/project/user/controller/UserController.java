package com.project.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.model.User;
import com.project.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@GetMapping("/user/{id}")
	public User getuser(@PathVariable int id) {
		
		User user= userservice.findUserById(id);	
				
		return user;
	}
	@GetMapping("/users")
	public List<User> getAlluser() {
		
	List <User> user= userservice.getAlluser();	
				
		return user; 
	}
	@PostMapping("/user")
	public User createproduct(@RequestBody User user) {
		
		userservice.addUser(user);
				
		return user;		
		
	}
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		
		userservice.deleteUserById(id);
		
	}
	@PutMapping("/user/{id}") 
	public User updateUser(@RequestBody User user ) {
		
		userservice.updateUser(user) ;
				
		return user;
	}
	

}
