package com.ust.crud.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Crud {
	@Id
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Crud(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Crud() {
		super();
	}
	
	

}
