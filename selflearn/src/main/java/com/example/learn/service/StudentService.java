package com.example.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn.model.Student;
import com.example.learn.repository.StudentRepository;
@Service
public class StudentService {
@Autowired
private StudentRepository studentrepository;
//private StudentService service;

	public  Optional<Student> findStudentById(String id) {

		return studentrepository.findById(id);
	}

	public List<Student> FindAllStudents() {
				
		return studentrepository.findAll() ;
	}

	public void addstudent(List<Student> student) {
		
		studentrepository.saveAll(student);
	}

	public void deletestudent(String id)  {
		
			studentrepository.deleteById(id);
		
		
	}

	public void updatestudent(Student student) {
		
		Optional<Student> s=studentrepository.findById(student.getId());
		s.get().setName(student.getName());
		studentrepository.save(student);
		
		
	}

}
