package com.company.Day15.lambdaDemo;

public class Demo02 {
    public static void main(String[] args) {
        invoke(() ->{
            System.out.println("lambda 表达式饭做好了");
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
