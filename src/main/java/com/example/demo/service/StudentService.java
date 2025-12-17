package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    StudentEntity insertStudent(StudentEntity st);

    List<StudentEntity> getAllStudents();

    Optional<StudentEntity> getOneStudent(Long id);

    void deleteStudent(Long id);
}
