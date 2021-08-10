package com.yyb.patterns.a7桥接模式.demo2;

public class Egg implements Batching {
    @Override
    public void add(String name) {
        System.out.println("配菜：" + name);
    }
}
