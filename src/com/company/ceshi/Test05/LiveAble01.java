package com.company.ceshi.Test05;

public interface LiveAble01 {

    // 默认方法
    public default void fly(){
        System.out.println("天上飞");
    }
}
