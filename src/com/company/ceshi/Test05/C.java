package com.company.ceshi.Test05;

public class C extends Animal implements B,A {
    @Override
    public void showYang(){

    }
    @Override
    public void show(){
        System.out.println("重写");
    }
    @Override
    public void method(){
        System.out.println("默认方法重写");
    }
}
