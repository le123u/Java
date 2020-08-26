package com.company.chongchongchong;

import com.company.ceshi.Test03.RandomDemo01;

import java.util.Random;

// 题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
public class Demo47 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int j = 0; j < 7; j++) {
            int i = random.nextInt(50);
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
