package com.company.Day15.lambdaDemo;

public class Demo06 {
    public static void main(String[] args) {

        // 使用lambda进行测试
        invokeCalc(5,6,(a,b) -> a+b);
    }
    public static void invokeCalc(int a , int b,Calculator calculator){
        int res =  calculator.calc(a,b);
        System.out.println("res = "+ res);
    }
}
