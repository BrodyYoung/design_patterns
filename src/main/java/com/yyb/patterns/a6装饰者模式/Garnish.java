package com.yyb.patterns.a6装饰者模式;

//抽象装饰角色-配料类
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
