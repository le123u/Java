package com.company.revise.Day07.demo09;

public class Dog extends Animal implements LiveAble,Pet {
    @Override
    public void showYang() {

}

    @Override
    public void show() {
        System.out.println("重写");
    }
}
