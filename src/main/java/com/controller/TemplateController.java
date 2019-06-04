package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/html")
public class TemplateController {
    @RequestMapping("center")
    public String center(){
        return "thymeleaf/center/center";
    }
    @RequestMapping("/index")
    public String index(ModelMap map, HttpServletRequest request){
        com.pojo.User user = new User();
        user.setAge(19);
        user.setBirthday(new Date());
        user.setName("李新龙");
        map.addAttribute(user);
        return "/thymeleaf/index";
    }

}
