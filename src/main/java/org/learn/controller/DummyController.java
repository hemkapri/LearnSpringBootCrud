package org.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "I am working";
    }

}
