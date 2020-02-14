package com.ada.poc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.poc.data.Student;
import com.ada.poc.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo studentRepo;

	@Autowired
	public StudentServiceImpl(final StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();

		students = studentRepo.findAll();

		return students;
	}

}
