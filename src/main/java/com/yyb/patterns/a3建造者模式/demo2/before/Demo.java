package com.yyb.patterns.a3建造者模式.demo2.before;

import org.junit.Test;

import java.math.BigDecimal;

public class Demo {
    @Test
    public void test_DecorationPackageController() {
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));
        // 轻奢⽥园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));
    }
}
