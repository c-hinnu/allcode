package com.example.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject,String> {

}
