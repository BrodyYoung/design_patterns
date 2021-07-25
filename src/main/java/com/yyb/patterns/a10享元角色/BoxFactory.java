package com.yyb.patterns.a10享元角色;

import javax.swing.*;
import java.util.HashMap;

//将该类设计为单例
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("Z", new ZBox());
    }

    private static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance() {
        return factory;
    }

    public AbstractBox getBox(String key) {
        return map.get(key);

    }
}
