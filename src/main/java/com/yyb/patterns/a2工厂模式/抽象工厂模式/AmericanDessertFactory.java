package com.yyb.patterns.a2工厂模式.抽象工厂模式;

public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();

    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }


}
