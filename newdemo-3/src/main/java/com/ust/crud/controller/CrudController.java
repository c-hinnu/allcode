package com.ust.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.crud.model.Crud;
import com.ust.crud.repository.CrudRepository;




@RequestMapping("")

@RestController
public class CrudController {
	@Autowired
	private CrudRepository crudrepo;
	@PostMapping("/cruds")
	public ResponseEntity<Crud> Addnew(@RequestBody Crud crud)
	{
		return ResponseEntity.ok().body(crudrepo.save(crud)); 
	}

	
		
	

}
