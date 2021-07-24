package com.yyb.patterns.a3建造者模式.demo1;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("橙色车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("尖车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
