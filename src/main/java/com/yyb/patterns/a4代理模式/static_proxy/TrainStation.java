package com.yyb.patterns.a4代理模式.static_proxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
