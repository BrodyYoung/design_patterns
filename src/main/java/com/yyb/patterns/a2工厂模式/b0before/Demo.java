package com.yyb.patterns.a2工厂模式.b0before;

public class Demo {
    public static void main(String[] args) {

        CoffeeStore cs = new CoffeeStore();
        Coffee latte = cs.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
