package com.controller.javaPrimaryKnowledge.javaProxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RealtorHandle implements InvocationHandler {

    /**
     * 房屋中介，相当于 proxy，此案例代替租客看房子，
     * 作为 proxy 需要持有一个被代理的对象（租房子的人)
     * */
    private Person person;
    public RealtorHandle(Person person){
        //可以通过带参构造函数，持有被代理对象
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("----dynamic被代理对象方法执行之前----");
        this.person.lookHourse();
        System.out.println("----被代理对象方法执行之后----");
        return null;
    }


}
