package com.company.revise.luan.demo13.demo10;

public interface LiveAble {
    public void show();

    public default void method(){
        System.out.println("LiveAble!");
    }

}
