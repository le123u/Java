package com.company.neibulei.NeiBuLei04;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Apple apple1 = new Apple(5, "青色");
        Apple apple2 = new Apple(3, "红色");

        System.out.println("默认挑大的:");
        Apple apple = worker.pickApple(new Com(), apple1, apple2);
        System.out.println(apple);

        System.out.println("挑红的:");
        Apple apple3 = worker.pickApple(new Com() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor()) ? a1 : a2;
            }
        }, apple1, apple2);
        System.out.println(apple3);
    }
}
