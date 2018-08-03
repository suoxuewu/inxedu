package com.edu.inxedu.manage.service;

import com.edu.inxedu.manage.bean.EduTeacher;
import com.edu.inxedu.manage.bean.EduUser;
import com.edu.inxedu.manage.bean.Page;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    Page<EduTeacher> queryPage(Map<String, Object> paramMap);

    void addTacher(EduTeacher eduTeacher);

    List<EduTeacher> getAllTeachers(Integer id);
}
