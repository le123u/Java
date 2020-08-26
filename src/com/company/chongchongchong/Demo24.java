package com.company.chongchongchong;

import java.util.Scanner;

// 题目：给一个不多于5位的正整数，
// 要求：一、求它是几位数，
// 二、逆序打印出各位数字。
public class Demo24 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个不多于五位数的数");
//        int i = scanner.nextInt();
//        if (i < 10){
//            System.out.println(i);
//            System.out.println("一位数");
//        }else if (i < 100){
//            int shi = i /10;
//            int ge = i % 10;
//            System.out.println(ge + ","+shi);
//            System.out.println("两位数");
//        }else if( i < 1000){
//            int bai = i / 100;
//            int shi = i /100 /10;
//            int ge = i % 10;
//            System.out.println(ge + ","+shi+","+bai);
//            System.out.println("三位数");
//        }else{
//            int qian = i /1000;
//            int bai = i %1000 /100;
//            int shi = i % 100 / 10;
//            int ge = i % 10;
//            System.out.println(ge + ","+shi+","+bai+","+qian);
//            System.out.println("四位数");
//        }
//
        num(2435);


    }
    public static void num(int n){
        String s = String.valueOf(n);
        String[] split = s.split("");
        System.out.println(split.length);
        for (int i = split.length-1; i >= 0 ; i--) {
            System.out.println(split[i]);

        }
    }
}
