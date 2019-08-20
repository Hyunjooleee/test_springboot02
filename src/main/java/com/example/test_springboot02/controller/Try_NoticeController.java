package com.example.test_springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Try_NoticeController{
    @RequestMapping(value = "/menu/notice/list")
    public void listAction(){
    }

    @RequestMapping(value = "/menu/notice/edit")
    public void editAction(){
    }

    @RequestMapping(value = "/menu/notice/delete")
    public void deleteAction(){
    }

    @RequestMapping(value = "/menu/notice/view")
    public void viewAction(){
    }
}