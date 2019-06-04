package com.controller;

import org.springframework.web.context.WebApplicationContext;

public class User {
    private String userName;
    private int age;
   public String userInfo(){
       this.userName = "lxl";
       this.age = 18;
        return "userName:"+ userName.toString() + "age:"+String.valueOf(age);
    }
}
