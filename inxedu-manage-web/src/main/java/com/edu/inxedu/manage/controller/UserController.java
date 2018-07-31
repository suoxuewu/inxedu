package com.edu.inxedu.manage.controller;
import com.edu.inxedu.manage.bean.EduUser;
import com.edu.inxedu.manage.bean.Page;
import com.edu.inxedu.manage.service.EduUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController extends BaseController{

    @Autowired
    EduUserService eduUserService;

    @RequestMapping(value = "user/queryPage",method = RequestMethod.POST)
    @ResponseBody
    public Object queryPage(@RequestParam(required=false,defaultValue="1")Integer pageno,
                            @RequestParam(required=false,defaultValue="10")Integer pagesize,
                            @RequestParam(required = false)String queryText){
        start();
        try {
            Map<String,Object> paramMap = new HashMap<String,Object>();
            paramMap.put("pageno", pageno);
            paramMap.put("pagesize", pagesize);
            paramMap.put("queryText",queryText);
            Page<EduUser> page = eduUserService.queryPage(paramMap);
            data(page);
            success(true);
        } catch (Exception e) {
            success(false);
            e.printStackTrace();
        }
        return end();
    }

}


