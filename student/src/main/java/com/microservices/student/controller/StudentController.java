package com.sneha.student.controller;

import com.sneha.student.entity.Student;
import com.sneha.student.service.StudentService;
import com.sneha.student.valueObjects.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    public StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/{id}/department")
    public Department getStudentDepartment(@PathVariable Long id){
        return studentService.getStudentDepartment(id);
    }

}
