package com.ust.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ust.practice.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {

}
