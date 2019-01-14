package com.wwtv.app.demo.controller;

import com.wwtv.app.demo.data.Student;
import com.wwtv.app.demo.repo.StudentRepo;
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