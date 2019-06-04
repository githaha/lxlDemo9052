package com.controller.javaPrimaryKnowledge.javaProxyDynamic;

import java.lang.reflect.Proxy;
/**
 * 此动态代理由于调用java 原生jdkreflect.Proxy，也称作JDK代理
 * 方法：
 * 1.创建一个接口；
 * 2.被代理对象要实现这个接口；
 * 3.创建一个InvocationHandler接口的实现类handle，实现接口方法invoke(),此类要持有一个被代理对象，在此invoke方法内
 *      调用被代理对象的实现方法，在被代理对象实现方法前后添加额外的逻辑代码
 * 4.创建一个Proxy对象，Proxy.newProxyInstance(classLoader,[interfaces],handle);
 *  传入三个参数，classLoader：类加载器，[interfaces]即被代理对象所实现的接口数组，
 *  则Proxy对象也具有和被代理对象相同的接口，handle即继承创建一个InvocationHandler接口的实现类handle
 *  此方法返回一个代理对象，可以强转为被代理对象相同接口的类型对象proxyRenter；
 * 5.proxyRenter由于跟被代理对象具有相同的接口，持有相同的实现方法，proxyRenter调用方法即可；
 * */
public class demoTest {
    public static void main(String[] args) {
        Renter renterN = new Renter("张三");
        RealtorHandle realtorHandle = new RealtorHandle(renterN);
        Person proxyRenter = (Person)Proxy.newProxyInstance(renterN.getClass().getClassLoader(),renterN.getClass().getInterfaces(),realtorHandle);
        proxyRenter.lookHourse();
    }
}
