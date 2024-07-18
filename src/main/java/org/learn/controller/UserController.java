package org.learn.controller;

import org.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService s;

    @RequestMapping(value = "/add-user", method = RequestMethod.GET)
    public String adduser(){
        s.adduser();
        return "User add Successfully";
    }


}
