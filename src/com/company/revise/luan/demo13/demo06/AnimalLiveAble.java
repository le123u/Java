package com.company.revise.luan.demo13.demo06;

public class AnimalLiveAble implements LiveAble {
    @Override
    public void eat() {
        System.out.println("卡卡早");
    }

    @Override
    public void sleep() {
        System.out.println("呼呼睡");
    }
}
