package com.company.revise.luan.demo13.demo9;

public interface LiveAble {
    public default void func(){
        func1();
        func2();
    }
    private void func1(){
        System.out.println("func1跑起来");
    }
    private void func2(){
        System.out.println("func2跑起来");
    }
}
