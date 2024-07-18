package org.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import MyTestClasses.ImmutableTesting;

@RestController
public class DummyController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){return "My name is Hem Kapri";}

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
        public String test2(){
            return "I Am testing Pallendrom String";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
        public String test3(){

        return "I am test class 3";
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
        public String test4(){
        return "I am Testing Singleton Class.";
    }
}




