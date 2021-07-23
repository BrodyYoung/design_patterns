package com.yyb.patterns.a2工厂模式.简单工厂模式;

public class Demo {
    public static void main(String[] args) {

        CoffeeStore cs = new CoffeeStore();
        Coffee latte = cs.orderCoffee("american");
        System.out.println(latte.getName());
    }
}
