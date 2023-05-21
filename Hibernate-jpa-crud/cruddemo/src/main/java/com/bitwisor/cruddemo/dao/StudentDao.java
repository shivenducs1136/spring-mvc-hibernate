package com.bitwisor.cruddemo.dao;

import com.bitwisor.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findStudentByLastName(String lstName);

    void delete(Integer id);

    int deleteAll();

    void update(Student theStudent);
}
