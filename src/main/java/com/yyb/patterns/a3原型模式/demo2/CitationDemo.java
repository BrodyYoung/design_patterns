package com.yyb.patterns.a3原型模式.demo2;

public class CitationDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        Citation c2 = c1.clone();
        c1.setName("张三");
        c2.setName("李四");
        c1.show();
        c2.show();


    }
}
