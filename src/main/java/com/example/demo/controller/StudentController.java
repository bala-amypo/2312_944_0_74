package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;  // Correct import

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService src;

    @PostMapping
    public StudentEntity postdata(@RequestBody StudentEntity st) {
        return src.insertStudent(st);
    }

    @GetMapping
    public List<StudentEntity> getdata() {
        return src.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getid(@PathVariable Long id) {
        return src.getOneStudent(id).orElse(null);
    }

    @PutMapping("/{id}")
    public StudentEntity putdata(@PathVariable Long id, @RequestBody StudentEntity st) {
        st.setId(id); // update id on entity before saving
        return src.insertStudent(st);
    }

    @DeleteMapping("/{id}")
    public String deletedata(@PathVariable Long id) {
        src.deleteStudent(id);
        return "Deleted student with id: " + id;
    }
}
