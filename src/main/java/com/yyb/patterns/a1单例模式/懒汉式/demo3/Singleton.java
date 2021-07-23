package com.yyb.patterns.a1单例模式.懒汉式.demo3;

//a1单例模式-懒汉式-方式4
//考虑线程安全，优先使用静态内部类的方式

public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}