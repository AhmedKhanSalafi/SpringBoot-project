package com.javakar.crud_spring_demo.service;


import com.javakar.crud_spring_demo.entity.Student;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    String deleteStudent(Student student);

}
