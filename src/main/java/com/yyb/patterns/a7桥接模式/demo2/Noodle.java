package com.yyb.patterns.a7桥接模式.demo2;

public class Noodle extends Food {
    public Noodle(Batching batching) {
        super(batching);
    }

    @Override
    public void fried(String name) {
        batching.add(name);
    }

}
