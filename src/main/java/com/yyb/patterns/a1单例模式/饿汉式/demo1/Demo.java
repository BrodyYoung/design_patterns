package com.yyb.patterns.a1单例模式.饿汉式.demo1;

public class Demo {
    public static void main(String[] args) {

        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();
        System.out.println(i1 == i2);   //ture

    }
}
