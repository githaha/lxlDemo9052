package com.controller.JavaProxyDemo;

public class TargetClass {

    public String method1(String param){
        return param;
    }
    public String method2(String param){
        return param;
    }

    @Override
    public String toString() {
        return "TargetObj []" + getClass();
    }
}
