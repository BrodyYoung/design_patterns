package com.yyb.patterns.a4代理模式.jdk_proxy;

public class Demo {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();

        SellTickets po = factory.getProxyObject();
        po.sell();

        System.out.println(po.getClass());

        while (true) {

        }
    }
}