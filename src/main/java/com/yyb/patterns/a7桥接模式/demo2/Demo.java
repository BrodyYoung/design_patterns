package com.yyb.patterns.a7桥接模式.demo2;

public class Demo {
    public static void main(String[] args) {
        Noodle noodle = new Noodle(new Bacon());
        noodle.fried("面条");

    }
}
