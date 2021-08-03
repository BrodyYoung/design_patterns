package com.yyb.patterns.a3建造者模式.demo2.after;

import java.math.BigDecimal;

public class LevelTwoCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司⾃带";
    }

    public String model() {
        return "⼆级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(850);
    }

    public String desc() {
        return "两个层次的吊顶，⼆级吊顶⾼度⼀般就往下吊20cm，要是层⾼很⾼，也可增加每级的厚度 ";
    }

}