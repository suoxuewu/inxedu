package com.edu.inxedu.manage.controller;
import com.edu.inxedu.manage.bean.EduTeacher;
import com.edu.inxedu.manage.bean.EduUser;
import com.edu.inxedu.manage.bean.Page;
import com.edu.inxedu.manage.service.EduUserService;
import com.edu.inxedu.manage.service.TeacherService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class TeacherController extends BaseController{

    @Autowired
    EduUserService eduUserService;
    @Autowired
    TeacherService teacherService;
    /**
     * doAdd文件上传
     */

    @RequestMapping(value="teacherAdd",method = RequestMethod.POST)
    @ResponseBody
    public Object doAdd(HttpServletRequest request, EduTeacher eduTeacher ,HttpSession session) {//@RequestParam()MultipartFile advpic
        start();
        try {
            MultipartHttpServletRequest mreq = (MultipartHttpServletRequest) request;//包装了request
            MultipartFile mfile = mreq.getFile("file");//MultipartFile在Sprigmvc 中用来保存文件advpic
            String name = mfile.getOriginalFilename();//java.jpg
            String extName = name.substring(name.lastIndexOf("."));//.jpg扩展名
            String iconPath = UUID.randomUUID().toString()+extName;//2222l.jpg文件名
            ServletContext servletContext = session.getServletContext();
            String realPath = servletContext.getRealPath("/pic");//硬盘上的路径
            String path = realPath+"\\adv\\"+iconPath;
            mfile.transferTo(new File(iconPath));
            //这里必须登录才能获取到user
            eduTeacher.setStatus(0);
            eduTeacher.setUpdateTime(new Date());
            eduTeacher.setCreateTime(new Date());
            eduTeacher.setPicPath(path);//图片的名字,数据库里只是保存了文件名，文件在，硬盘上
            teacherService.addTacher(eduTeacher);
           // User user = (User)session.getAttribute(Const.LOGIN_USER);
            success(true);
        } catch (Exception e) {
            success(false);
            e.printStackTrace();
        }
        return end();
    }
    @RequestMapping(value = "fileUpload",method = RequestMethod.POST)
    public String fileUpload(@RequestParam(value = "desc")String desc,
                             @RequestParam(value = "file")MultipartFile[] multipartFile) throws IOException {
        for (MultipartFile file : multipartFile) {
            if(!file.isEmpty()){
                file.transferTo(new File("D:\\files\\"+file.getOriginalFilename()));
                System.out.println("file.getOriginalFilename()"+file.getOriginalFilename());
            }
        }
        return  "redirect:/teacherList";
    }

    @RequestMapping(value = "teacherAdds",method = RequestMethod.POST)
    public String teacherAdd(EduTeacher eduTeacher, HttpServletRequest request, Model model){
      if(eduTeacher!=null){
          eduTeacher.setStatus(0);
          eduTeacher.setUpdateTime(new Date());
          eduTeacher.setCreateTime(new Date());
          teacherService.addTacher(eduTeacher);
      }
      return "addTeacher";
    }
    @RequestMapping(value = "teacher/queryPage",method = RequestMethod.POST)
    @ResponseBody
    public Object queryPage(@RequestParam(required=false,defaultValue="1")Integer pageno,
                            @RequestParam(required=false,defaultValue="10")Integer pagesize){
        start();
        try {
            Map<String,Object> paramMap = new HashMap<String,Object>();
            paramMap.put("pageno", pageno);
            paramMap.put("pagesize", pagesize);
            Page<EduTeacher> page = teacherService.queryPage(paramMap);
            data(page);
            success(true);
        } catch (Exception e) {
            success(false);
            e.printStackTrace();
        }
        return end();
    }

}


