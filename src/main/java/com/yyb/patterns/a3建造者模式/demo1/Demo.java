package com.yyb.patterns.a3建造者模式.demo1;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike b = director.construct();
        System.out.println(b.getFrame());
        System.out.println(b.getSeat());
    }
}
