package com.yyb.patterns.a4代理模式.cglib_proxy;

public class Demo {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();

        TrainStation po = proxyFactory.getProxyObject();
        po.sell();
    }
}
