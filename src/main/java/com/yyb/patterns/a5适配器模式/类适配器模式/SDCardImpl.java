package com.yyb.patterns.a5适配器模式.类适配器模式;

public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "SDCard:HelloWorld";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard:" + msg);
    }
}
