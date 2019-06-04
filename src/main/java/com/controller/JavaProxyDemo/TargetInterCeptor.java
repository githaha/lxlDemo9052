package com.controller.JavaProxyDemo;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetInterCeptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("调用前");
        Object result =  methodProxy.invokeSuper(obj,objects);
        System.out.println("调用后");
        return result;
    }
}
