package com.yyb.patterns.a5适配器模式.类适配器模式;

//适配者类
public class Computer {

    public String readSD(SDCard sc) {
        if (sc == null) {
            throw new NullPointerException("sdcard is not null");
        }
        return sc.readSD();
    }
}
