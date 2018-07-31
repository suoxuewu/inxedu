package com.edu.inxedu.manage.service;

import com.edu.inxedu.manage.bean.EduUser;
import com.edu.inxedu.manage.bean.Page;

import java.util.Map;

public interface EduUserService {
    Page<EduUser> queryPage(Map<String, Object> paramMap);
}
