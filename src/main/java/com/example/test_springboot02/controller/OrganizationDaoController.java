package com.example.test_springboot02.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationDaoController{
    @Autowired
    @RequestMapping(value = "/organization/{action}",method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView actionMethod(@PathVariable String action, ModelAndView modelandView){
        String viewName = "/organization/" + action;
        List<Object> resultList = new ArrayList<Object>();
        //resultList = (List)repository.findAll();
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }
}