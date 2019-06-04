package com.controller.javaPrimaryKnowledge.javaProxyStatic;

public class RealtorProxy implements Person {

    /**
     * 房屋中介，相当于 proxy，此案例代替租客看房子，
     * 作为 proxy 需要持有一个被代理的对象（租房子的人)
     * */
    private Person person;
    public RealtorProxy(Person person){
        //可以通过带参构造函数，持有被代理对象
        this.person = person;
    }
    @Override
    public void lookHourse() {
        System.out.println("----被代理对象方法执行之前----");
        this.person.lookHourse();
        System.out.println("----被代理对象方法执行之后----");

    }
}
