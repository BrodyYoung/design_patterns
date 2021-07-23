package com.yyb.patterns.a1单例模式.饿汉式.demo1;
//a1单例模式-饿汉式-方式1
public class Singleton {
    public Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;

    }

}
