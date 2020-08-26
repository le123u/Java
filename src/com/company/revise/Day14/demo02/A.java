package com.company.revise.Day14.demo02;

public interface A {
    public abstract void showA();

    private static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.println(str+"");
        }
        System.out.println();
    }

    public static void showB10(){
        System.out.println("static B");
        show10("BBBBB");
    }

    public static void show10C(){
        System.out.println("static C");
        show10("CCCCCCC");
    }
}
