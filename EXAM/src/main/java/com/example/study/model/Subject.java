package com.example.study.model;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
//@Table(name="Subject")
public class Subject {
	@Id
	private String id;
	private String name;
	public Subject() {
		super();
	}
	
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
