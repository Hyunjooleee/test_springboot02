package com.example.test_springboot02.service;

import java.util.HashMap;
import java.util.Map;

import com.example.test_springboot02.dao.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// public class MemberService{
//     public Object getObject(Object dataMap){
//         Map<String, Object> resultObject = new HashMap<String,Object>();
//         resultObject.put("MEMBER_ID", "123456789");
//         resultObject.put("NAME", "name02");
//         return resultObject;
//     }
// }

public class MemberService{
    @Autowired
    private MemberDao dao;
    public Object getObject(Object dataMap){
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}