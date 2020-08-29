package com.company.revise.luan.demo13.demo10;

import com.company.revise.luan.demo13.demo9.Animal;

public class Dog extends Animal implements LiveAble,Pet {
    @Override
    public void showYang() {

    }

    @Override
    public void show() {
        System.out.println("重写");
    }

    @Override
    public void method() {
        System.out.println("aaaa");
    }
}
