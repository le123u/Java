package com.company.chongchongchong;

import java.util.Scanner;

// 题目：判断一个素数能被几个9整除
public class Demo45 {
    public static void main(String[] args) {
        System.out.println("请输入一个素数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Demo45 d = new Demo45();
        d.suan(num);
    }

    public boolean sushu(int num) {
        boolean b = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public void suan(int num) {
        int count = 0;
        int temp = num;
        if (sushu(num)) {
            System.out.println("你输入的素数是" + num);
        } else {
            System.out.println("输入不合法，请重新开始");
            return;
        }
        int count2 = 0;
        while (true) {
            count2++;
            if (temp % 9 == 0) {
                count++;
                temp /= 9;
            } else {
                if (count2 == 1) {
                    System.out.println("素数" + num + "不能被9整除");
                } else {
                    System.out.println("素数" + num + "能被" + count + "个9整除");
                }
                break;
            }
        }
    }
}