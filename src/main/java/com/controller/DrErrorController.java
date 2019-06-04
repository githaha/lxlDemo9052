package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("c_Error")
public class DrErrorController {
    @RequestMapping("/error")
    public String error(){
        int a = 1 /0;
        return  "thymeleaf/error";
    }
}
