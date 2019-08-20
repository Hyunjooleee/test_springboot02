package com.example.test_springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Try_MenuController{
    @RequestMapping(value = "/menu/login")
    public void loginAction(){
    }

    @RequestMapping(value = "/menu/logout")
    public void logoutAction(){
    }

    @RequestMapping(value = "/menu/join")
    public void joinAction(){
    }
}