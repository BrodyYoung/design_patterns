package com.yyb.patterns.a2工厂模式.b2静态简单工厂模式;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee co = SimpleCoffeeFactory.createCoffee(type);
        co.addMilk();
        co.addSugar();
        return co;
    }
}
