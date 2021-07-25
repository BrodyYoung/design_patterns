package com.yyb.patterns.a7桥接模式;

public class Demo {
    public static void main(String[] args) {
        OperatingSystem w = new Windows(new AVIFile());
        w.play("顺丰小哥.avi");
        System.out.println("=======================");

        OperatingSystem m = new Mac(new RMVBFile());
        m.play("浴室.rmvb");

    }
}
