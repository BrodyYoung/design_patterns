package com.yyb.patterns.a3建造者模式.demo1;

//抽象建造者类
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
