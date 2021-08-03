package com.yyb.patterns.a2工厂模式.源码分析;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Demo2 {
    public static void main(String[] args) {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        DateFormat instance = DateFormat.getInstance();
    }
}
