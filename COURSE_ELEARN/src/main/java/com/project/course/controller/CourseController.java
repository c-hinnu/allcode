package com.project.course.controller;

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

import com.project.course.model.Course;
import com.project.course.service.CourseService;



@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired 
	private CourseService courseservice;
	
	@GetMapping("/course/{id}")
	public Course getcourse(@PathVariable int id) {
		
		Course course= courseservice.findCourseById(id);	
				
		return course;
	}
	
	@GetMapping("/courses")
	public List<Course> getAllproduct() {
		
	List <Course> course= courseservice.getAllcourse();	
				
		return course; 
	}
	@PostMapping("/course")
	public Course createcourse(@RequestBody Course course) {
		
		courseservice.addCourse(course);
				
		return course;		
		
	}
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable int id) {
		
		courseservice.deleteCourseById(id);
		
	}
	@PutMapping("/course/{id}") 
	public Course updateCourse(@RequestBody Course course ) {
		
		courseservice.updateCourse(course) ;
				
		return course;
	}
	

}
