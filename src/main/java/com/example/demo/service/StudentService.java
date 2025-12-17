package com.example.demo.service;
import java.util.List;

import java.util.Optional;
import com.example.demo.Entity.StudentEntity;

public interface StudentService {
    StudentEntity insertStudent(Student st);
    List<Student> getAllStudents();
    Optional<Student> getOneStudent(Long id);
    void deleteStudent(Long id);
}