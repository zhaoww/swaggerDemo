package com.zww.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by zhaoww on 2017/4/28.
 */
@RestController
@RequestMapping(path = "/test")
public class TestController {

       Map<String, String> users = new HashMap<String, String>(){{
           put("k1","v1");
           put("k2","v2");
           put("k4","v3");
           put("k4","v4");
       }};

//    @RequestMapping(path = "/one", method = RequestMethod.POST)
//    public Object test() {
//        return null;
//    }
//
//    @RequestMapping(path = "/info", method = RequestMethod.GET)
//    public String getInfo(){
//        return "haha fish";
//    }
//
//    @RequestMapping(path = "/info2")
//    public String getInfo2(){
//        return "haha fish";
//    }
//
//    @RequestMapping(path = "/info3",method = RequestMethod.PUT)
//    public String putInfo(){
//        return "haha fish";
//    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public String getUser(@PathVariable("userId") String id){
        return users.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(){
       users.put("k9","v9");
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("userId") String id){
        users.remove(id);
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.POST)
    public void updateUser(@PathVariable("userId") String id){
        users.put(id,"p1");
    }

}
