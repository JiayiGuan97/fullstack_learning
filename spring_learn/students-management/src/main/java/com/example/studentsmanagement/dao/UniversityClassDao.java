package com.example.studentsmanagement.dao;

import com.example.studentsmanagement.model.UniversityClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityClassDao extends CrudRepository<UniversityClass, Long> {

}
