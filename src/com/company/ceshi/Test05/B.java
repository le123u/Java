package com.company.ceshi.Test05;

public interface B {
    public void showYang();

    public void show();

    public default void method(){
        System.out.println("B");
    }
}
