package com.company.revise.Day07.demo10;

public interface LiveAble {

    public void show();
    public default void method(){
        System.out.println("LiveAble");
    }
}
