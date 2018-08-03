package com.edu.inxedu.manage.serviceImpl;
import com.edu.inxedu.manage.bean.EduTeacher;
import com.edu.inxedu.manage.bean.EduUser;
import com.edu.inxedu.manage.bean.Page;
import com.edu.inxedu.manage.mapper.EduTeacherMapper;
import com.edu.inxedu.manage.mapper.EduUserMapper;
import com.edu.inxedu.manage.service.EduUserService;
import com.edu.inxedu.manage.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Service
public class EduTeacherServiceImpl implements TeacherService {

    @Autowired
    EduUserMapper eduUserMapper;
    @Autowired
    EduTeacherMapper eduTeacherMapper;


    @Override
    public Page<EduTeacher> queryPage(Map<String, Object> paramMap) {
        Integer pageno = (Integer) paramMap.get("pageno");
        Integer pagesize = (Integer) paramMap.get("pagesize");
        Page<EduTeacher> page = new Page<>(pageno, pagesize);
        Integer startindex = page.getStartIndex();
        paramMap.put("startindex", startindex);
        //2.查询这一页数据
        List<EduTeacher> datas = eduTeacherMapper.queryPage(startindex,pagesize);
        //3.查询总记录数
        Integer totalsize = eduTeacherMapper.count(paramMap);
        page.setDatas(datas);
        page.setTotalsize(totalsize);
        return page;
    }

    @Override
    public void addTacher(EduTeacher eduTeacher) {
        eduTeacherMapper.insertSelective(eduTeacher);
    }

    @Override
    public List<EduTeacher> getAllTeachers(Integer id) {
        List<EduTeacher> eduTeachers = eduTeacherMapper.selectAll();
        return eduTeachers;
    }
}
