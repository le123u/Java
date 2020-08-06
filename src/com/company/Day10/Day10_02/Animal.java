package com.company.Day10.Day10_02;

public class Animal implements LiveAble{

    @Override
    public void eat() {
        System.out.println("就知道吃");
    }

    @Override
    public void sleep() {
        System.out.println("还睡呀");

    }

    @Override
    public void fly() {
        System.out.println("左右飞");
    }
    // 无法重写静态方法
}
