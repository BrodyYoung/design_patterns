package com.yyb.patterns.a8外观角色;

//电灯类（子系统角色）
public class Light {

    public void on() {
        System.out.println("开灯");
    }

    public void off() {
        System.out.println("关灯");
    }
}
