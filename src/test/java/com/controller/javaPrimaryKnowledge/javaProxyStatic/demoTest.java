package com.controller.javaPrimaryKnowledge.javaProxyStatic;

/**
 * java 静态代理--原理：
 * 1：代理 和 被代理 都共同实现一个接口，即代理和被代理拥有共同的实现方法comMethod()；
 * 2：让代理持有 被代理对象
 * 3：在 被代理对象comMethod里实现 被代理自己的业务逻辑
 * 4：在 代理的comMethod里 执行被代理的comMethod方法，并在 被代理对象的方法被调用前后根据需要
 *      添加其他的业务逻辑，这样 被代理对象的业务逻辑不会受到外界影响
 *
 * */


public class demoTest {
    public static void main(String[] args) {
        Renter renterN = new Renter("张三");
        RealtorProxy realtorProxy = new RealtorProxy(renterN);
        realtorProxy.lookHourse();
    }
}
