package com.yyb.patterns.a2工厂模式.b2静态简单工厂模式;

public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
