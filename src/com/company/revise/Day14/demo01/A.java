package com.company.revise.Day14.demo01;

public interface A {

    public abstract void showA();

   private void show10(String str){
       for (int i = 0; i < 10; i++) {
           System.out.println(str+"");
       }
       System.out.println();
    }

    public default void showB10(){

       show10("BBB");

    }
    public default void show10C(){

       show10("ccc");
    }
}
