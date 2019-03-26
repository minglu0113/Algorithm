package com.zhang.designpatterns.Proxy;

public class Proxy {
    public static void main(String[] args)
    {
        Person p = new Man();
        MyInvocationhandler myInvocationhandler = new MyInvocationhandler(p);
        Person p1 = (Person) java.lang.reflect.Proxy.newProxyInstance(p.getClass().getClassLoader(),p.getClass().getInterfaces(),myInvocationhandler);
        p1.say();
    }
}
