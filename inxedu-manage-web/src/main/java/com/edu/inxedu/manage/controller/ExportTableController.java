package com.edu.inxedu.manage.controller;
import com.edu.inxedu.manage.bean.EduUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ExportTableController {

        @RequestMapping("export")
        @ResponseBody
        public Map<String,Object> listProduct(@RequestParam(value = "limit", required = false)Integer limit, @RequestParam(value = "offset", required = false)Integer offset) {
            Map<String,Object> map = new HashMap<>();

            List<EduUser> list = new ArrayList<EduUser>();//此处应该是从数据库查出来的数据,为了测试方便写个循环
            for (int i = offset; i < limit+offset; i++) {
                EduUser EduUser = new EduUser();
                EduUser.setUserId(i);
                EduUser.setUserName("用户名"+i);
                EduUser.setSex(i);
                EduUser.setCreateTime(Timestamp.valueOf("注册时间"+i+""));
                EduUser.setIsAvalible(Integer.valueOf("状态"+i));
                list.add(EduUser);
            }
            map.put("total", 100);//假设共有100条数据
            map.put("rows", list);
            return  map;
        }
    }
