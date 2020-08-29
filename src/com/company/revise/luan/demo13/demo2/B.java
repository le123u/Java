package com.company.revise.luan.demo13.demo2;

public class B extends A {
//    int b = 5;
    int a = 6;
    @Override
    public void show(){
        System.out.println(this.a);
       System.out.println(super.a);
    }
}
