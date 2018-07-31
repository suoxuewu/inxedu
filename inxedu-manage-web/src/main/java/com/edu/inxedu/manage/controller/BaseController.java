package com.edu.inxedu.manage.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
    private ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal();
    public void start(){
        Map<String,Object> result = new HashMap<String,Object>();
        threadLocal.set(result);
    }
    public void success(boolean success){
        Map<String, Object> result = threadLocal.get();
        result.put("success",success);
    }
    public void data(Object data){
        Map<String, Object> result = threadLocal.get();
        result.put("data",data);
    }
    public Object end(){
        Map<String, Object> result = threadLocal.get();
        return result;
    }
}
