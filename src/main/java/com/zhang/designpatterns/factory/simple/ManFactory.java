package com.zhang.designpatterns.factory.simple;

public class ManFactory {
    public static People getMan(int s) {
        switch (s){
            case 1:
                return new Man();
            case  2:
                return  new Woman();
            default: return new Man();
        }
    }
}
