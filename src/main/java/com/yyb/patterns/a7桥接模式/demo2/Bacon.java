package com.yyb.patterns.a7桥接模式.demo2;

public class Bacon implements Batching {
    @Override
    public void add(String name) {
        System.out.println("培根炒：" + name);
    }
}
