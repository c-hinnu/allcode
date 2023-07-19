package com.project.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.course.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
	

}
