package com.edu.inxedu.manage.service.impl;

import com.edu.inxedu.bean.EduArticle;
import com.edu.inxedu.manage.mapper.EduArticleMapper;
import com.edu.inxedu.service.ManageService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService{

    @Autowired
    private EduArticleMapper eduArticleMapper;


    @Override
    public List<EduArticle> getEduArticleList() {
        return eduArticleMapper.selectAll();
    }
}
