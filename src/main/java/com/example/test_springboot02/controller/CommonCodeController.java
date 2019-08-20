package com.example.test_springboot02.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCodeController{
    @RequestMapping(value = "/commonCode/edit")
    public void edit_action(){
    }
    @RequestMapping(value = "/commonCode/{action}")
    public ModelAndView edit(@RequestParam Map<String, Object>paramMap, @PathVariable String action, ModelAndView modelandView){
        String viewName = "/commonCode/";
        Map<String,Object> resultMap = new HashMap<String,Object>();
        if("read02".equals(action)){
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap",resultMap);
        return modelandView;

    }
}