package com.company.revise.Day08;

public interface LiveAble {
    public void show();

    public default void method(){
        System.out.println("LiveAble");
    }
}
