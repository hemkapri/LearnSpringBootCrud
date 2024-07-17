package org.learn.controller;

import org.learn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String test(){
        service.addStudent();


        return "Student saved sucessfully";
    }
}
