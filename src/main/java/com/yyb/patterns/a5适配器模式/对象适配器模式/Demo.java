package com.yyb.patterns.a5适配器模式.对象适配器模式;

public class Demo {
    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String s = computer.readSD(sdCard);
        System.out.println(s);

        System.out.println("======================");
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String s1 = computer.readSD(sdAdapterTF);
        System.out.println(s1);

    }
}
