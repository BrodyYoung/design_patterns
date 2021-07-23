package com.yyb.patterns.a2工厂模式.简单工厂模式;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory f = new SimpleCoffeeFactory();
        Coffee co = f.createCoffee(type);
        co.addMilk();
        co.addSugar();
        return co;
    }
}
