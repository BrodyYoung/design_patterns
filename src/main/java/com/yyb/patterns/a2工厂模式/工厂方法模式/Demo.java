package com.yyb.patterns.a2工厂模式.工厂方法模式;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        CoffeeStore cs = new CoffeeStore();

        CoffeeFactory factory = new LatteCoffeeFactory();
        cs.setFactory(factory);
        Coffee coffee = cs.orderCoffee();
        System.out.println(coffee.getName());

    }
}
