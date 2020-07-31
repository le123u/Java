package com.company;

public class Demo {
    public static void main(String[] args) {
        double a = 2;//分子
        double b = 1;//分母
        double sum = 0;//和
        double temp;
        for( int i = 0; i < 20; i++) {
            sum += a / b;
            temp = a;
            a = a + b;
            b = temp;
        }
        System.out.println(sum);
    }
}


