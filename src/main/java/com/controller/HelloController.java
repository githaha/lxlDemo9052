package com.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pojo.IMoocJSONResult;
import com.pojo.Resource;
import com.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/****
 * 1:@ResponseBody,表示这个controller方法返回方法里的Return数据,而无法返回html,jsp页面；
 * 2:@Controller,调用返回方法里的相对资源路径，返回的html,
 * 1) 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，
 * 配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
 * 2) 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
 */
//@RestController==@Controller+@ResponseBody;
@RestController()
@RequestMapping("/data")
public class HelloController {

    @Autowired
    private Resource resourceN;

    @RequestMapping("/world")
    public String[] index() {
        String[] list = new String[4];
        list[0] = "1";
        list[1] = "2";
        list[2] = "3";
        list[3] = "3";
        return list;
    }
    @RequestMapping("/getUser")
    public Object getUser(){
        User user = new User();
        user.setName("zhangsan");
        user.setAge(18);
        user.setBirthday(new Date());
        return user;
    }
    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson(){

        User user = new User();
        user.setName("zhangsan");
        user.setAge(18);
        user.setBirthday(new Date());
        return IMoocJSONResult.ok(user);

    }
    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){

        System.out.println(resourceN);
        Resource resource = new Resource();
        //不能直接返回resourceN，因为此对象是Bean，Json无法解析
        BeanUtils.copyProperties(resourceN,resource);
        return IMoocJSONResult.ok(resource);
    }

}
