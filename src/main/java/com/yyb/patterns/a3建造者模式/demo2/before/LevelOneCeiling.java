package com.yyb.patterns.a3建造者模式.demo2.before;

import java.math.BigDecimal;

public class LevelOneCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司⾃带";
    }

    public String model() {
        return "⼀级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(260);
    }

    public String desc() {
        return "造型只做低⼀级，只有⼀个层次的吊顶，⼀般离顶120-150mm";
    }
}