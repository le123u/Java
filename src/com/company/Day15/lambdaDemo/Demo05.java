package com.company.Day15.lambdaDemo;

public class Demo05 {
    public static void main(String[] args) {

        // 使用lambda调用测试
        invokeCalc(5,6,(int a , int b) ->{
            return a + b;
        });

    }
    public static void invokeCalc(int a , int b,Calculator calculator){
       int res =  calculator.calc(a,b);
        System.out.println("res = "+ res);
    }
}
