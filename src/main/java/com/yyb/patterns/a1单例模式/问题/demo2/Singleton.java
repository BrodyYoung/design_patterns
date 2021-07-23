package com.yyb.patterns.a1单例模式.问题.demo2;

//a1单例模式-懒汉式-方式4
//考虑线程安全，优先使用静态内部类的方式
//反射会导致单例模式失效


public class Singleton {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}