package com.example.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learn.model.Student;

public interface StudentRepository extends JpaRepository<Student,String>{

}
