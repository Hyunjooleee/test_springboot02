package com.example.test_springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController{
    @RequestMapping(value = "/member/list")
    public void memberAction(){
    }
}