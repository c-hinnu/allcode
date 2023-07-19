package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
private UserRepository userrepo;
//to get all values
@GetMapping("/users")
public ResponseEntity<List<User>> getAll()
{
List<User> us=userrepo.findAll();
if(us.isEmpty())
{
return ResponseEntity.noContent().build();
}
return ResponseEntity.ok().body(us);
}
//to get one value
@GetMapping("/users/{id}")
public  ResponseEntity<Optional<User>> getUserById(@PathVariable String id){
	var usr =userrepo.findById(id);
	if(usr.isEmpty())
	{
		return ResponseEntity.noContent().build();
	}
	return ResponseEntity.ok().body(usr);
	}
//to add new value
@PostMapping("/users")
public  ResponseEntity<User> AddUser(@RequestBody User user)
{
	return ResponseEntity.ok().body(userrepo.save(user));
}
//to update value
@PutMapping("/users/{id}")
public ResponseEntity<User> UpdateUser(@PathVariable String id,@RequestBody User user)
{
	var us=userrepo.findById(id);
	if(us.isPresent())
	{
		var ur=us.get();
		ur.setId(id);
		ur.setName(user.getName());
		userrepo.save(ur);
		return ResponseEntity.ok().body(ur);
	}
	return ResponseEntity.noContent().build();
	
}
//to delete a value
@DeleteMapping("/users/{id}")
public ResponseEntity<User> deleteUser(@PathVariable String id)
{
	var us=userrepo.findById(id);
	if(us.isPresent())
	{
		
		userrepo.deleteById(id);
		return ResponseEntity.ok().build();
	}
	return ResponseEntity.notFound().build(); 
}

}
	

	

