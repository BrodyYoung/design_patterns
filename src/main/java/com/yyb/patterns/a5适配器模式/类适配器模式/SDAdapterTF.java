package com.yyb.patterns.a5适配器模式.类适配器模式;

//定义适配器类（SD兼容TF）
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read TFCard");
        return null;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter read TFCard");
        writeTF(msg);
    }
}
