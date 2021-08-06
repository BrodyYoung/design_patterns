package com.yyb.patterns.a6装饰者模式;

//具体构件角色-炒面类
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(10, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
