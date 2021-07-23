package com.yyb.patterns.a1单例模式.饿汉式.demo3;

public class Demo {
    public static void main(String[] args) {

        Singleton i1 = Singleton.INSTANCE;
        Singleton i2 = Singleton.INSTANCE;
        System.out.println(i1 == i2);   //ture

    }
}
