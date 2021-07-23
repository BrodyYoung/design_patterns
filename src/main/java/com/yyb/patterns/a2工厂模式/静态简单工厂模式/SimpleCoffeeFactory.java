package com.yyb.patterns.a2工厂模式.静态简单工厂模式;

public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
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
