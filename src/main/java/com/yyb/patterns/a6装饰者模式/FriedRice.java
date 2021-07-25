package com.yyb.patterns.a6装饰者模式;

public class FriedRice extends FastFood {

    public FriedRice() {
        super(12, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
