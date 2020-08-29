package com.company.revise.luan.demo13.demo7;

public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }
}
