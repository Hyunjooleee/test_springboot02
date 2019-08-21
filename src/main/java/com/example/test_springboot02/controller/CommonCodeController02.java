package com.example.test_springboot02.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCodeController02{
    @RequestMapping(value = "/commonCode/list")
    public void list_action(){
    }
    @RequestMapping(value = "/commonCode/{action01}")
    public ModelAndView list(@RequestParam ArrayList<Object>paramMap, @PathVariable String action01, ModelAndView modelandView){
        String viewName = "/commonCode/";
        ArrayList<Object> resultList = new ArrayList<Object>();
        if("list".equals(action01)){
            viewName = viewName + action01;
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("NAME","name01");
            data01.put("COMMON_CODE_ID", "123456789");
            data01.put("DESCRIPTION","anything DESCRIPTION01");
            resultList.add(data01);
        }
        modelandView.addObject("resultList",resultList);
        return modelandView;

    }
}