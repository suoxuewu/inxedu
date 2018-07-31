package com.edu.inxedu.manage.controller;


import com.edu.inxedu.bean.EduArticle;
import com.edu.inxedu.service.ManageService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class ManageController {

    @RequestMapping(value="/addRole")
    public String addRole(){
        return "role/addRole";
    }
    @RequestMapping(value="/assignRole")
    public String assignRole(){
        return "assignRole";
    }
    @RequestMapping(value="/addTeacher")
    public String addTeacher(){
        return "addTeacher";
    }
    @RequestMapping(value="/teacherList")
    public String teacherList(){
        return "teacherList";
    }
    @RequestMapping(value="/userList")
    public String userList(){
        return "userList";
    }
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }

}
