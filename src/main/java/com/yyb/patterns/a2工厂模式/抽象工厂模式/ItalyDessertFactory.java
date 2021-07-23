package com.yyb.patterns.a2工厂模式.抽象工厂模式;

public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
