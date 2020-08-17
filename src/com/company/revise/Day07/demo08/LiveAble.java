package com.company.revise.Day07.demo08;

public interface LiveAble {

    public default void fun(){
        func1();
        func2();
    }

    private void func1(){
        System.out.println("跑起来");
    }
    private void func2(){
        System.out.println("动起来");
    }
}
