package com.company.revise.Day07.demo10;

public interface Pet {
    public void showYang();

    public default void method(){
        System.out.println("Pet");
    }
}
