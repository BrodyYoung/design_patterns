package com.yyb.patterns.a5适配器模式.类适配器模式;

public class Demo {
    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String s = computer.readSD(sdCard);
        System.out.println(s);

        System.out.println("======================");
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);

    }
}
