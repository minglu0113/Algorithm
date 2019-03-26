package com.zhang.designpatterns.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationhandler implements InvocationHandler {
    private Object object;
    public MyInvocationhandler(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----");
        method.invoke(object,args);
        System.out.println("-----");
        return null;
    }
}
