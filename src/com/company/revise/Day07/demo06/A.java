package com.company.revise.Day07.demo06;

public interface A {
    private void fly(){
        System.out.println("sssssssss");
    }
    public default void ff(){
        fly();
    }
}
