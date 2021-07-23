package com.yyb.patterns.a1单例模式.问题.demo1;

//a1单例模式-懒汉式-方式4
//考虑线程安全，优先使用静态内部类的方式
//序列化、反序列化会导致单例模式失效

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //在Singleton类中定义readResolve()方法，反序列化时被调用。
    // 如果定义了这个方法，就返回这个方法的值，如果没定义这个方法，则返回new出来的对象
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}