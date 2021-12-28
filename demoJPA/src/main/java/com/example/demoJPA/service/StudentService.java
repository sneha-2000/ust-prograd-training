package com.example.demoJPA.service;

//                        Service
//  StudentRepository -------------------- Controller

import com.example.demoJPA.entity.Student;
import com.example.demoJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student){

        return repo.save(student);
    }
    public List<Student> listAll(){

        return repo.findAll();
    }
}
