package com.company.ceshi.Test05;

public interface A {
    // 多实现抽象方法重名
    public abstract void show();

    // 多实现默认方法重名
    public default void method(){
        System.out.println("A");
    }
}
