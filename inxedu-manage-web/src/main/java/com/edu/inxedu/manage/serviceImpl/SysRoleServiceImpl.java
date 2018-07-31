package com.edu.inxedu.manage.serviceImpl;

import com.edu.inxedu.manage.bean.SysRole;
import com.edu.inxedu.manage.mapper.SysRoleMapper;
import com.edu.inxedu.manage.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService{
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public List<SysRole> getRoleList() {
        List<SysRole> sysRoleList = sysRoleMapper.selectAll();
        return sysRoleList;
    }

    @Override
    public void insertRole(SysRole sysRole) {
        sysRoleMapper.insert(sysRole);
    }
}
