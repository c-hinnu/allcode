package com.ust.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.crud.model.Crud;

@Repository
public interface CrudRepository extends JpaRepository<Crud,String> {

}
