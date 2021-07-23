package com.yyb.patterns.a1单例模式.懒汉式.demo2;
//a1单例模式-懒汉式-方式3
public class Singleton {

    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
