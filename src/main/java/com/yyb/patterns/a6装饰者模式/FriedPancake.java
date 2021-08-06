package com.yyb.patterns.a6装饰者模式;

//具体构件角色-炒饼类
public class FriedPancake extends FastFood {

    public FriedPancake() {
        super(8, "炒饼");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
