package com.yyb.patterns.a1单例模式.问题.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class clazz = Singleton.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);

        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();
        System.out.println(s1 == s2);


    }
}
