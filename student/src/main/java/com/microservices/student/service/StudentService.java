package com.sneha.student.service;

import com.sneha.student.entity.Student;
import com.sneha.student.repository.StudentRepository;
import com.sneha.student.valueObjects.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Department getStudentDepartment(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        Long departmentId = student.getDepartmentId();
        //return restTemplate.getForObject("http://localhost:8002/department/"+dId,Department.class);
        return (Department) restTemplate.getForObject("http://localhost:8002/department/"+departmentId, Object.class);
    }
}
