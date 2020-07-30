package com.company.Day15.lambdaDemo;

public class Demo07 {
    public static void main(String[] args) {
        invokeShow(100,a -> a+100);
    }
    public static void invokeShow(int a,Show show){
       int res =  show.show(a);
        System.out.println(res);

    }
}
