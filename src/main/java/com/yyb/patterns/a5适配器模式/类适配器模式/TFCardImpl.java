package com.yyb.patterns.a5适配器模式.类适配器模式;

//目标接口
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard:HelloWorld";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard:" + msg);
    }
}
