package com.zhang.designpatterns.simplefactoryAndstrategy;

public class Context {
    private Strategy strategy;
    public Context(String s){
        switch (s){
            case "A":
                this.strategy = new StrategyA();
                break;
            case "B":
                this.strategy = new StrategyB();
                break;
            default:this.strategy = new StrategyA();
        }
    }
    public void execute(){
        strategy.executeStrategy();
    }
}
