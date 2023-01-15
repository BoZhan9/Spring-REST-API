package com.sample.classmanagement.service;

import com.sample.classmanagement.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    StudentEntity addStudent(StudentEntity studentEntity); // create
    List<StudentEntity> findAllStudents(); // read
    Optional<StudentEntity> findStudentById(Integer id); // read
    StudentEntity updateStudent(StudentEntity studentEntity); // update
    void removeStudentById(Integer id); // delete
}
