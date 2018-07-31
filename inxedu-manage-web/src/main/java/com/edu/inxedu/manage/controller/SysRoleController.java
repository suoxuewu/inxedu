package com.edu.inxedu.manage.controller;
import com.edu.inxedu.manage.bean.SysRole;
import com.edu.inxedu.manage.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
import java.util.List;

@Controller
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping(value = "addRole",method = RequestMethod.POST)
    public String addRole(SysRole sysRole){
        sysRole.setCreateTime(new Date());
        sysRoleService.insertRole(sysRole);
        return "assignRole";
    }
    @RequestMapping("roleList")
//    @ResponseBody
    public String roleList(Model model){
       List<SysRole> roleList = sysRoleService.getRoleList();
       model.addAttribute("roleList",roleList);
       return "assignRole";
    }
}
