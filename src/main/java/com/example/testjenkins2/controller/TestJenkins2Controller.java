package com.example.testjenkins2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJenkins2Controller {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
