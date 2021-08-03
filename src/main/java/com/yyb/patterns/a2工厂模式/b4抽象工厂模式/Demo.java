package com.yyb.patterns.a2工厂模式.b4抽象工厂模式;

public class Demo {
    public static void main(String[] args) {
        ItalyDessertFactory f = new ItalyDessertFactory();
        Coffee c = f.createCoffee();
        System.out.println(c.getName());
        Dessert d = f.createDessert();
        d.show();

    }
}
