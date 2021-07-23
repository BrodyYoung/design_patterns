package com.yyb.patterns.a1单例模式.懒汉式.demo3;

public class Demo {
    public static void main(String[] args) {

        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();
        System.out.println(i1 == i2);   //ture
    }
}
