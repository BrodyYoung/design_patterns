package com.yyb.patterns.a2工厂模式.b3工厂方法模式;

public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
