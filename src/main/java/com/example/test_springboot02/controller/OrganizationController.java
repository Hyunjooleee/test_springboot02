package com.example.test_springboot02.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController {
    @RequestMapping(value = "/organization/input")
    public void input_action(){
    }
    @RequestMapping(value = "/organization/read")
    public ModelAndView read(@RequestParam Map<String,Object> paramMap, ModelAndView modelAndView) {
        // String viewName = "/organization/read";
        // modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }
}