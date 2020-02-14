package com.ada.poc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.poc.data.Student;
import com.ada.poc.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;

	@Autowired
	public StudentController(final StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping(path = "/getStudents", produces = "application/json")
	public List<Student> getStudents() {

		List<Student> students = studentService.getAllStudents();

		return students;
	}

//	@PostMapping(path = "/saveStudent")
//	public void saveStudent(@RequestBody Student student) {
//
//		studentService.saveStudent(student);
//
//	}
//
//	@GetMapping(path = "/getStudentById/{id}", produces = "application/json")
//	public Optional<Student> getStudentById(@PathVariable(value = "id") int id) {
//
//		Optional<Student> student = studentService.getStudentById(id);
//
//		return student;
//	}

}
