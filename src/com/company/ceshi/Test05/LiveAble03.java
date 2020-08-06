package com.company.ceshi.Test05;

public interface LiveAble03 {

    // 将func1和func2封装到默认方法中
    public default void func(){
        func1();
        func2();
    }
    // 私有方法
    void func1(){
        System.out.println("func1跑起来");
    }
    void func2(){
        System.out.println("func2跑起来");
    }
}
