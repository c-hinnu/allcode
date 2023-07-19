package com.example.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn.model.Student;
import com.example.learn.service.StudentService;

@RestController
public class StudentController{
  
	@Autowired
	StudentService studentservice;
	@GetMapping("/students/{id}")
	public  Optional<Student> getstudent(@PathVariable String id )
	{
		Optional<Student> student=null;
		try {
	student=studentservice.findStudentById(id);
	return student;
	}
catch (Exception e) 
	{
	return student;
	}
		
	}
	@GetMapping("/students")
	public List<Student> getallstudents()
	{
	List<Student> students = studentservice.FindAllStudents();
	return students;
	}
	@PostMapping("/students")
	public String createstudent(@RequestBody  List<Student> student)
	{   
	studentservice.addstudent(student);
	return "successfully inserted";
	}
	@DeleteMapping("/students/{id}")
	public String delete(@PathVariable String id ) 
	{
	try 
	{
	studentservice.deletestudent(id);
	return "Deleted";
	} catch (Exception e) {
			
			return "ID NOT EXIST";
		}
	}
	@PutMapping("/students/{id}")
	public String updatestudent(@RequestBody Student student)
	{
		try {
		studentservice.updatestudent(student);
		return "updated";
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			return "ID NOT EXIST";
		}
	}

	}
