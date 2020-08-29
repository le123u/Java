package com.company.revise.luan.demo13.demo12;

public interface C extends A,B {
    @Override
    public default void method(){
        System.out.println("CCC");
    }
}
