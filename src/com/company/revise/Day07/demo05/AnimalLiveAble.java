package com.company.revise.Day07.demo05;

public class AnimalLiveAble implements LiveAble {
    @Override
    public void eat() {
        System.out.println("卡卡吃");
    }

    @Override
    public void sleep() {

        System.out.println("呼呼睡");
    }
}
