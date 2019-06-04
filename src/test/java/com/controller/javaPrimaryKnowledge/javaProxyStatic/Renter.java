package com.controller.javaPrimaryKnowledge.javaProxyStatic;

public class Renter implements Person {

    public String name;
    public Renter(String name){
        this.name = name;
    }
    @Override
    public void lookHourse() {
        System.out.println(this.name + "看房子");
    }
}
