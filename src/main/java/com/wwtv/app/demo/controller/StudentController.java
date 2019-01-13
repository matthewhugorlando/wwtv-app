package com.wwtv.demo.controller;

import com.wwtv.demo.data.Student;
import com.wwtv.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public Iterable<Student> listStudents(){
        return studentRepo.findAll();
    }

}