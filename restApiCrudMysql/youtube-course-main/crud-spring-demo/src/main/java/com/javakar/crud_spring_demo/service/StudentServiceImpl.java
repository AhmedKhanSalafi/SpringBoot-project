package com.javakar.crud_spring_demo.service;

import com.javakar.crud_spring_demo.entity.Student;
import com.javakar.crud_spring_demo.repository.StudentRepository;
import com.javakar.crud_spring_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Student student) {
        studentRepository.delete(student);
        return "Deleted successfully";
    }
}
