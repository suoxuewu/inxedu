package com.edu.inxedu.manage.serviceImpl;
import com.edu.inxedu.manage.bean.EduUser;
import com.edu.inxedu.manage.bean.Page;
import com.edu.inxedu.manage.mapper.EduUserMapper;
import com.edu.inxedu.manage.service.EduUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class EduUserServiceImpl implements EduUserService{

    @Autowired
    EduUserMapper eduUserMapper;


    @Override
    public Page<EduUser> queryPage(Map<String, Object> paramMap) {
        Integer pageno = (Integer) paramMap.get("pageno");
        Integer pagesize = (Integer) paramMap.get("pagesize");
        String queryText = (String) paramMap.get("queryText");
        Page<EduUser> page = new Page<>(pageno, pagesize);
        Integer startindex = page.getStartIndex();
        paramMap.put("startindex", startindex);
        //2.查询这一页数据
        List<EduUser> datas = eduUserMapper.queryPage(queryText,startindex,pagesize);
        //3.查询总记录数
        Integer totalsize = eduUserMapper.count(paramMap);
        page.setDatas(datas);
        page.setTotalsize(totalsize);
        return page;
    }
}
