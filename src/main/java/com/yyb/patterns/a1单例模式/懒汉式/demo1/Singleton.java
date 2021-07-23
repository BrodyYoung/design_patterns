package com.yyb.patterns.a1单例模式.懒汉式.demo1;

//a1单例模式-懒汉式-方式1   无synchronized，线程不安全
//a1单例模式-懒汉式-方式2   有synchronized，线程安全
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}