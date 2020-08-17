package com.company.revise.Day07.demo09;

public interface LiveAble {
    public void show();

    public default void method(){
        System.out.println("LiveAble");
    }
}
