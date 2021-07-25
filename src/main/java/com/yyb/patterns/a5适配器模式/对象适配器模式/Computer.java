package com.yyb.patterns.a5适配器模式.对象适配器模式;

public class Computer {

    public String readSD(SDCard sc) {
        if (sc == null) {
            throw new NullPointerException("sdcard is not null");
        }
        return sc.readSD();
    }
}
