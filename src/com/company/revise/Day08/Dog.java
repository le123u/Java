package com.company.revise.Day08;

public class Dog extends Animal implements LiveAble,Pet {
    @Override
    public void eat() {
        System.out.println("汪汪地吃狗粮");
    }

    @Override
    public void showYang() {

    }
}
