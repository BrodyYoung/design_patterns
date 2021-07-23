package com.yyb.patterns.a2工厂模式.工厂方法模式;

public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();

    }
}
