package com.yyb.patterns.a6装饰者模式;

public class Demo {
    public static void main(String[] args) {

        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + "\t\t" + food.cost() + "元");

        System.out.println("======================");

        food = new Egg(food);
        System.out.println(food.getDesc() + "\t\t" + food.cost() + "元");
        System.out.println("======================");

        food = new Egg(food);
        System.out.println(food.getDesc() + "\t\t" + food.cost() + "元");
        System.out.println("======================");

        food = new Bacon(food);
        System.out.println(food.getDesc() + "\t\t" + food.cost() + "元");

        System.out.println("======================");

        FastFood food2 = new FriedNoodles();
        food2 = new Bacon(food2);
        System.out.println(food2.getDesc() + "\t\t" + food2.cost() + "元");

        System.out.println("======================");
        FastFood food3 = new FriedPancake();
        food3 = new Ham(food3);
        System.out.println(food3.getDesc() + "\t\t" + food3.cost() + "元");

        System.out.println("======================");
        food3 = new Egg(food3);
        System.out.println(food3.getDesc() + "\t\t" + food3.cost() + "元");


    }
}
