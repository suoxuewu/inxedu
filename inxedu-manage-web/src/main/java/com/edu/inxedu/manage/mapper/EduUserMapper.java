package com.edu.inxedu.manage.mapper;
import com.edu.inxedu.manage.bean.EduUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
import java.util.Map;


public interface EduUserMapper extends Mapper<EduUser> {

    Integer count(Map<String, Object> paramMap);

    List<EduUser> queryPage(@Param("qu") String queryText,@Param("st") Integer startindex, @Param("pa") Integer pagesize);
}
