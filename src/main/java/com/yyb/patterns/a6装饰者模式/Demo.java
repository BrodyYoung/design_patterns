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
    }
}
