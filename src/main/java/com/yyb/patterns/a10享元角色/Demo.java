package com.yyb.patterns.a10享元角色;

public class Demo {
    public static void main(String[] args) {

        AbstractBox box1 = BoxFactory.getInstance().getBox("Z");
        box1.display("红色 ");

        AbstractBox box2 = BoxFactory.getInstance().getBox("O");
        box2.display("蓝色 ");


        AbstractBox box3 = BoxFactory.getInstance().getBox("I");
        box3.display("绿色 ");

        AbstractBox box4 = BoxFactory.getInstance().getBox("I");
        box4.display("灰色 ");

        System.out.println("box3与box4是否是同一个对象：" + (box3 == box4));
    }
}
