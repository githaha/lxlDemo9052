package com.controller.JavaProxyDemo;

public class Student implements Person{

   private String name;

    public String getName() {
        return name;
    }

    public Student(String name){
       this.name = name;
   }

    @Override
    public void payMoney() {
        System.out.println(name+"支付了50元");
    }

}
