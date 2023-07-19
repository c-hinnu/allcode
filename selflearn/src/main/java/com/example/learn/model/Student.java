package com.example.learn.model;

import javax.persistence.Entity;
import javax.persistence.Id;


//@Table(name="student")
@Entity
public class Student {
	@Id
	//@Column(name="s_id")
	private String id;
	//@Column(name="s_name")
	private String name;
	
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
