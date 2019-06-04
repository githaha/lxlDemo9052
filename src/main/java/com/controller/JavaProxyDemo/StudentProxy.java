package com.controller.JavaProxyDemo;

public class StudentProxy implements Person {

   private Student Stu;
    public StudentProxy(Person stu){
        Stu = (Student)stu;
    }
    @Override
    public void payMoney() {
        System.out.println("班长代理"+Stu.getName());
        Stu.payMoney();
    }
}
