package com.yyb.patterns.a4代理模式.static_proxy;

public class ProxyPoint {
    private TrainStation ts = new TrainStation();

    public void sell() {
        System.out.println("代理点收取服务费");
        ts.sell();
    }
}
