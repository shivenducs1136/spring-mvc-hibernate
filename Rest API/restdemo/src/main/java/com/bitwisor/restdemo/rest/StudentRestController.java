package com.bitwisor.restdemo.rest;


import com.bitwisor.restdemo.entity.Student;
import com.bitwisor.restdemo.entity.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    List<Student> mlist;
    @PostConstruct
    public void loadData(){
        mlist = new ArrayList<Student>();
        mlist.add(new Student("Shivendu","Mishra"));
        mlist.add(new Student("Shivangi","Mishra"));
        mlist.add(new Student("Santosh","Mishra"));
    }
    // add code for the "/hello" endpoint
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return mlist;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        if((studentId<0) || (studentId>=mlist.size())){
            throw new StudentNotFoundExceptionClass("Student id not found - "+studentId);
        }
        return mlist.get(studentId);
    }

    // Add an exception Handler using @ExceptionHandler


}
