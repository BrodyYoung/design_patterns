package com.yyb.patterns.a7桥接模式.demo1;

public class Demo {
    public static void main(String[] args) {
        OperatingSystem w = new Windows(new AVIFile());
        w.play("大圣归来.avi");
        System.out.println("=======================");

        OperatingSystem m = new Mac(new RMVBFile());
        m.play("哪吒闹海.rmvb");

    }
}
