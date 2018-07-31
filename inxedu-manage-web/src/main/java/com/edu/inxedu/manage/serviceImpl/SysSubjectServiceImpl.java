package com.edu.inxedu.manage.serviceImpl;

import com.edu.inxedu.manage.mapper.SysSubjectMapper;
import com.edu.inxedu.manage.service.SysSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysSubjectServiceImpl implements SysSubjectService{
    @Autowired
    private SysSubjectMapper sysSubjectMapper;
}
