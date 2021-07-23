package com.yyb.patterns.a3原型模式.demo;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Realizetype r = new Realizetype();
        Realizetype clone = r.clone();
        System.out.println(r == clone);
    }
}
