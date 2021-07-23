package com.yyb.patterns.a2工厂模式.工厂方法模式;

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee co = factory.createCoffee();
        co.addMilk();
        co.addSugar();
        return co;
    }
}
