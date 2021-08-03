package com.yyb.patterns.a2工厂模式.b0before;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee c = null;
        if ("american".equals(type)) {
            c = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            c = new LatteCoffee();
        } else {
            throw new RuntimeException("您所点的咖啡没有");
        }
        c.addMilk();
        c.addSugar();
        return c;
    }
}
