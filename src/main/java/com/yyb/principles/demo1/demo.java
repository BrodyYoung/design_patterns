package com.yyb.principles.demo1;

import javafx.scene.control.Skin;

public class demo {
    public static void main(String[] args) {
        SougouInput sg = new SougouInput();

//        DefaultSkin ds = new DefaultSkin();
//        sg.setSkin(ds);
        HeimaSkin hs = new HeimaSkin();
        sg.setSkin(hs);
        sg.display();

    }
}
