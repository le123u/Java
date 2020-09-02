package com.company.revise.luan.demo14.demo01;

import com.company.revise.luan.demo13.demo10.Pet;
import com.company.revise.luan.demo13.demo8.LiveAble;

public class Dog extends Animal implements LiveAble, Pet {
    @Override
    public void showYang() {

    }

    @Override
    public void show() {

    }

    @Override
    public void eat() {
        System.out.println("汪汪的吃狗粮");

    }
}
