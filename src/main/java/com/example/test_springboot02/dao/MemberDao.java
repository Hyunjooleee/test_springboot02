package com.example.test_springboot02.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao{
    public Object getObject(Object dataMap){
        Map<String,Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID","12345678910");
        resultObject.put("NAME","name 02");
        resultObject.put("TEL","010-5874-7438");
        resultObject.put("EMAIL","hjdjl7@naver.com");
        return resultObject;
    }
}

// public class MemberDao{
//     public Object getList(List dataMap){
//         ArrayList<Object> resultObject = new ArrayList<Object>();
//         Map<String, Object> data01 = new HashMap<String, Object>();
//         resultObject.put("MEMBER_ID","12345678910");
//         resultObject.put("NAME","name 02");
//         resultObject.put("TEL","010-5874-7438");
//         resultObject.put("EMAIL","hjdjl7@naver.com");
//         return resultObject;
//     }
// }