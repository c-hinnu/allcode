package com.excercise.learn.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.excercise.learn.model.Employee;
import com.excercise.learn.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository emprepo;
	@PostMapping("/employees")
	public ResponseEntity<Employee> Addnew(@RequestBody Employee emp)
	{
		return ResponseEntity.ok().body(emprepo.save(emp));
	}
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee> em=emprepo.findAll();
		if(em.isEmpty())
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(em);
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<Optional<Employee>> getById(@PathVariable Long id)
	{
	 Optional<Employee> emp=emprepo.findById(id);
	 if(emp.isEmpty())
	 {
		 return ResponseEntity.noContent().build();
	 }
	 return ResponseEntity.ok().body(emp);
	}
	@PutMapping("/employees/")
	public ResponseEntity<Employee> Update(@RequestBody Employee emp)
	{
		//Optional<Employee> em=emprepo.findById(emp.getId());
		//if(em.isPresent())
		//{
			//Employee e=em.get();
			//e.setId(emp.getId());
			//e.setName(emp.getName());
			//emprepo.save(e);
			//return ResponseEntity.ok().body(e);
		//}
		return ResponseEntity.ok().body(emp);
	}
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> delete(@PathVariable Long id)
	{
		Optional<Employee> emp=emprepo.findById(id);
		if(emp.isPresent())
		{
			emprepo.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.noContent().build();
		
	}
}
