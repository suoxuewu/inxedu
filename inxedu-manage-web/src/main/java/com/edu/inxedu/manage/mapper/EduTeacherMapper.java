package com.edu.inxedu.manage.mapper;

import com.edu.inxedu.manage.bean.EduTeacher;
import com.edu.inxedu.manage.bean.EduUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;


public interface EduTeacherMapper extends Mapper<EduTeacher> {

    Integer count(Map<String, Object> paramMap);

    List<EduTeacher> queryPage(@Param("st") Integer startindex, @Param("pa") Integer pagesize);
}
