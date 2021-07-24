package com.yyb.patterns.a4代理模式.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//获取代理对象的工厂类
public class ProxyFactory {
    private TrainStation t = new TrainStation();

    /*
    ClassLoader loader : 类加载器
    Class<?>[] interfaces :
    InvocationHandler h ：
     */
    public SellTickets getProxyObject() {
        SellTickets st = (SellTickets) Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取服务费（JDK）");
                        Object o = method.invoke(t, args);
                        return o;
                    }
                }
        );
        return st;
    }
}
