package com.yyb.patterns.a3建造者模式.demo2.after;

import org.junit.Test;

public class Demo {
    @Test
    public void test_DecorationPackageController() {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢⽥园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
