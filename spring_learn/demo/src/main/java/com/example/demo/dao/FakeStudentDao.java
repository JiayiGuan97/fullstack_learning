package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class FakeStudentDao implements StudentDao {
    private List<Student> Database = new ArrayList<>();
    @Override
    public List<Student> selectAllStudents() {
        return Database;
    }

    @Override
    public int insertStudent(Student student) {
        UUID id = UUID.randomUUID();
        Database.add(new Student(id, student.getName()));
        return 1;
    }

    @Override
    public int updateStudent(Student student) {
        int indexToUpdate = -1;
        for (int i = 0; i < Database.size(); i++) {
            if (student.getId().equals(Database.get(i).getId())) {
                indexToUpdate = i;
                break;
            }
        }
        if (indexToUpdate < 0) {
            return -1;
        }
        Database.set(indexToUpdate, student);
        return 0;
    }

    public int deleteStudentByID(UUID id) {
        int indexToDelete = -1;
        for (int i = 0; i < Database.size(); i++) {
            if (id.equals(Database.get(i).getId())) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete < 0) return -1;
        Database.remove(indexToDelete);
        return 0;
    }
}
