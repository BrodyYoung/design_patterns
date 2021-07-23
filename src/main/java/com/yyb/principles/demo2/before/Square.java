package com.yyb.principles.demo2.before;

public class Square extends Rectangle {


    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);

    }
}
