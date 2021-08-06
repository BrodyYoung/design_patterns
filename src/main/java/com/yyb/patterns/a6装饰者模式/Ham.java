package com.yyb.patterns.a6装饰者模式;

//具体装饰角色-火腿肠类
public class Ham extends Garnish {
    public Ham(FastFood fastFood) {
        super(1.5F, "火腿肠", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
