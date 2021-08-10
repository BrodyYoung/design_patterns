package com.yyb.patterns.a7桥接模式.demo2;

public abstract class Food {

    protected Batching batching;

    public Food(Batching batching) {
        this.batching = batching;
    }

    public abstract void fried(String name);
}
