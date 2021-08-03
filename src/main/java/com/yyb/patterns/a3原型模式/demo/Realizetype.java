package com.yyb.patterns.a3原型模式.demo;

public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("构造了一个对象");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("完成了克隆");
        return (Realizetype) super.clone();
    }
}
