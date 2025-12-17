package com.example.demo.service;
import java.util.List;

import java.util.Optional;
import com.example.demo.Entity.StudentEntity;

public interface StudentService {
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getdata();
    StudentEntity updatedata getOneStudent(Long id);
    String deleteStudent(int id);
}