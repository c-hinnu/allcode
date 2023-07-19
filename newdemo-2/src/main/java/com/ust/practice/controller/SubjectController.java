package com.ust.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.practice.bean.Subject;
import com.ust.practice.repository.SubjectRepository;


@RestController
public class SubjectController {
	@Autowired
	private SubjectRepository subrepo;
	@PostMapping("/subjects")
	public ResponseEntity<Subject> Addnew(@RequestBody Subject sub)
	{
		return ResponseEntity.ok().body(subrepo.save(sub));
	}
	

	

}
