package com.yyb.principles.demo2.after;

public class Square implements Quadrilateral {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }
}
