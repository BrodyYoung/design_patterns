package com.yyb.patterns.a10享元角色;

//抽象享元角色
//内部状态是形状，外部状态是颜色
public abstract class AbstractBox {

    //获取图形的方法
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状是" + getShape() + "，方块颜色是" + color);
    }
}
