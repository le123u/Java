package com.company.revise.Day09.demo01;

public class Test {
    public static void main(String[] args) {
        FlyAble flyAble = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我要起飞了");

            }
        };

        flyAble.fly();
    }
}
