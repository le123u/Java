package com.company.revise.Day13;

public class C extends B {
    @Override
    public void showB() {
        System.out.println("B类中：numb"+numb);
    }

    @Override
    public void showA() {
        System.out.println("A类中：numa"+numa);
    }

    int numc = 30;
    public void showC() {
        System.out.println("C类中：numc"+numc);
    }
}
