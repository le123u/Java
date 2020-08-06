package com.company.chongchongchong;

import java.util.Scanner;

/**
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问前10个月每个月的兔子对数为多少？
 */
public class Demo01_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查的月份：");
        int i1 = scanner.nextInt();
        int a = 1 ;
        System.out.println("第1个月兔子有"+a+"对");
        int b = 1 ;
        System.out.println("第2个月兔子有"+b+"对");
        int c;
        for (int i = 3; i <= i1; i++) {
               c = a ;
               a =a + b;
               b = c;
            System.out.println("第"+i+"个月兔子有"+a+"对");

            }

        }

    }

