package com.yyb.patterns.a3原型模式.demo3;

public class CitationDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        Citation c2 = c1.clone();
        c1.setS(new Student("赵六"));
        c2.setS(new Student("王八"));
        c1.show();
        c2.show();
    }
}
