package com.yyb.patterns.a1单例模式.饿汉式.demo2;
//a1单例模式-饿汉式-方式2
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
