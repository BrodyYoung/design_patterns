package com.yyb.patterns.a2工厂模式.源码分析;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Collection 是抽象工厂
* ArrayList 是具体工厂
* Iterator 是抽象产品
* ArrayList$Itr 是具体产品
* */
public class Demo1 {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("小张");
        s.add("小李");
        s.add("小王");
        Iterator<String> iters = s.iterator();

        while (iters.hasNext()){
            String next = iters.next();
            System.out.println(next);

        }

    }

}
