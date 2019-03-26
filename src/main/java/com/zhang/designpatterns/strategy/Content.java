package com.zhang.designpatterns.strategy;

public class Content {
    private Strategy strategy;
    public Content(Strategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(){
        strategy.myStrategy();
    }
}
