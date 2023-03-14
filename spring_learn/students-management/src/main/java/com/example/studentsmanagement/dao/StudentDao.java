package com.example.studentsmanagement.dao;

import com.example.studentsmanagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends CrudRepository<Student, Long>{
    List<Student> findByName(String name);
}
