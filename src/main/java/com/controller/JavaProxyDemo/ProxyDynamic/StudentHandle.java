package com.controller.JavaProxyDemo.ProxyDynamic;

import com.controller.JavaProxyDemo.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentHandle implements InvocationHandler {

    Person person;
    public StudentHandle(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("method--"+method);
        System.out.println("args--"+args);
        System.out.println("统一处理执行方法开始：---");
        method.invoke(person,args);
        System.out.println("统一处理执行方法结束：---");
        return null;
    }
}
