package com.example.study.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.Subject;
import com.example.study.repository.SubjectRepository;



@RestController
public class SubjectController {
	@Autowired
	private SubjectRepository subrepo;
	@PostMapping("/subjects")
	public ResponseEntity<Subject> Addnew(@RequestBody Subject sub)
	{
		return ResponseEntity.ok().body(subrepo.save(sub));
	}
	@GetMapping("/subjects")
	public ResponseEntity<List<Subject>> getAll()
	{
		List<Subject> su = subrepo.findAll();
		if(su.isEmpty())
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(su);
	}
	@GetMapping("/subjects/{id}")
	public ResponseEntity<Optional<Subject>> getById(@PathVariable String id)
	{
		Optional<Subject> sub = subrepo.findById(id);
		if(sub.isEmpty())
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(sub);
	}
	@PutMapping("/subjects/{id}")
	public ResponseEntity<Subject> Update(@PathVariable String id,@RequestBody Subject subject)
	{
		Optional<Subject> sub=subrepo.findById(id);
		if(sub.isPresent())
		{
			Subject s=sub.get();
			s.setId(id);
			s.setName(subject.getName());
			subrepo.save(s);
			return ResponseEntity.ok().body(s);
		}
		return ResponseEntity.noContent().build();
	}
	@DeleteMapping("/subjects/{id}")
	public ResponseEntity<Subject> delete(@PathVariable String id)
	{
		Optional<Subject> sur=subrepo.findById(id);
		if(sur.isPresent())
		{
			subrepo.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}

	

}
