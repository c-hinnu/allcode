package com.project.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.course.model.Course;
import com.project.course.repository.CourseRepository;
@Service
public class CourseService {
	@Autowired
	private CourseRepository courserepository;

	public Course findCourseById(int id) {
		Optional<Course> result = courserepository.findById(id);
		Course course=result.get();
		return course;
	}

	public List<Course> getAllcourse() {
		
		return courserepository.findAll();
	}

	public void addCourse(Course course) {
		
		 courserepository.save(course);
	}

	public void deleteCourseById(int id) {
		courserepository.deleteById(id);
		
	}

	public void updateCourse(Course course) {
		Optional<Course> result = courserepository.findById(course.getC_id());
		result.get().setC_name(course.getC_name());
		result.get().setC_desc(course.getC_desc());
		courserepository.save(course);
		
	
		
	}

	

}
