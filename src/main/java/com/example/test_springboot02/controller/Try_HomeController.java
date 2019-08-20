package com.example.test_springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Try_HomeController{
    @RequestMapping(value = "/try_home")
    public String action(){
        return "try_home";
    }
}