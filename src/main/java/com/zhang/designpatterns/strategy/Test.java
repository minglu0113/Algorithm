package com.zhang.designpatterns.strategy;

public class Test {
    public static void main(String[] args)
    {
        Content content = new Content(new StrategyA());
        content.executeStrategy();
    }
}
