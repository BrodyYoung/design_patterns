package com.yyb.patterns.a3建造者模式.demo2.before;

import java.math.BigDecimal;

public class MarcoPoloTile implements Matter {
    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "马可波罗(MARCO POLO)";
    }

    public String model() {
        return "缺省";
    }

    public BigDecimal price() {
        return new BigDecimal(140);
    }

    public String desc() {
        return "“马可波罗”品牌诞⽣于1996年，作为国内最早品牌化的建陶品牌，以“⽂化陶瓷”占领市场，享有“仿古砖⾄尊”的美誉。";
    }
}