package com.edu.inxedu.manage.service;

import com.edu.inxedu.manage.bean.SysRole;

import java.util.List;

public interface SysRoleService {
    List<SysRole> getRoleList();

    void insertRole(SysRole sysRole);
}
