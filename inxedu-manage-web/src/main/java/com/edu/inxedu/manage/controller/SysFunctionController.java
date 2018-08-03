package com.edu.inxedu.manage.controller;
import com.edu.inxedu.manage.bean.Permission;
import com.edu.inxedu.manage.bean.SysFunction;
import com.edu.inxedu.manage.service.SysFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SysFunctionController extends BaseController{

    @Autowired
    private SysFunctionService sysFunctionService;

    @RequestMapping(value ="/permission/loadData")
    @ResponseBody
    public  Object permission(){
//      Map<Integer,SysFunction> map = new HashMap<>();
        Map<Integer,Permission> map = new HashMap<>();

      //存放根节点
      List<Permission> data = new ArrayList<>();
        Permission root =null;
      List<SysFunction> allList = sysFunctionService.getAllSysFunction();
        for (SysFunction sys : allList) {
            Permission permission = new Permission();
            permission.setId(sys.getFunctionId());
            permission.setName(sys.getFunctionName());
            permission.setPid(sys.getParentId());
            permission.setIcon(sys.getImageUrl());
            permission.setOpen(true);
            permission.setUrl(sys.getFunctionUrl());
            map.put(permission.getId(),permission);
        }
        for (SysFunction per : allList) {
            if(per.getParentId()==null){
                root = map.get(per.getFunctionId());
            }else {
                SysFunction child = per;
                Integer pid = child.getParentId();
                Permission parent = map.get(pid);
                parent.getChildren().add(map.get(per.getFunctionId()));
            }
        }
        data.add(root);
        return data;
    }
}
