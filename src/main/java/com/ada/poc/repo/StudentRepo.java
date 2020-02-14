package com.ada.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ada.poc.data.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//	Student findById(int id);

}
