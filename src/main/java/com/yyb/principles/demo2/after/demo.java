package com.yyb.principles.demo2.after;

public class demo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        resize(r);
        print(r);
        System.out.println("================");
        Square s = new Square();
        s.setSize(10);
        print(s);

    }


    private static void resize(Rectangle r) {
        while (r.getWidth() <= r.getLength()) {
            r.setWidth(r.getWidth() + 1);

        }
    }

    private static void print(Quadrilateral r) {
        System.out.println("Length\t" + r.getLength());
        System.out.println("Width\t" + r.getWidth());

    }
}
