package com.yyb.patterns.a2工厂模式.b1简单工厂模式;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee c = null;
        if ("american".equals(type)) {
            c = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            c = new LatteCoffee();
        } else {
            throw new RuntimeException("您所点的咖啡没有");
        }
        return c;
    }

}
