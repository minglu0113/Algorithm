package com.zhang.designpatterns.simplefactoryAndstrategy;

public class Test {
    public static void main(String[] args)
    {
        Context context = new Context("B");
        context.execute();
    }
}
