package com.edu.inxedu.manage.serviceImpl;

import com.edu.inxedu.manage.bean.SysFunction;
import com.edu.inxedu.manage.mapper.SysFunctionMapper;
import com.edu.inxedu.manage.service.SysFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysFunctionServiceImpl implements SysFunctionService{
    @Autowired
    private SysFunctionMapper sysFunctionMapper;

    @Override
    public List<SysFunction> getAllSysFunction() {
        List<SysFunction> sysFunctionList = sysFunctionMapper.selectAll();
        return sysFunctionList;
    }
}
