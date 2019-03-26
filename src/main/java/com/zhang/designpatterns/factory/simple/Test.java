package com.zhang.designpatterns.factory.simple;

public class Test {
    public static void main(String[] args)
    {
        People p = ManFactory.getMan(1);
        System.out.println(p);
    }
}
