package com.yyb.patterns.a3建造者模式.demo1;

//具体建造者类
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("黄色车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("宽车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
