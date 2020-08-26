package com.company.chongchongchong;

import java.util.Scanner;

// 题目：某个公司采用公用电话传递数据，
// 数据是四位的整数，在传递过程中是加密的，
// 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
// 再将第一位和第四位交换，第二位和第三位交换。
public class Demo48 {
    public static void main(String[] args) {
        System.out.println("请输入一个四位数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a, aa, aaa, aaaa;
        a = number % 10;
        aa = number / 10 % 10;
        aaa = number / 100 % 10;
        aaaa = number / 1000;
        // 代替数字
        a = (a + 5) % 10;
        aa = (aa + 5) % 10;
        aaa = (aaa + 5) % 10;
        aaaa = (aaaa + 5) % 10;
        // 第一位和第四位交换
        int temp;
        temp = a;
        a = aaaa;
        aaaa = temp;
        // 第二位和第三位交换
        temp = aa;
        aa = aaa;
        aaa = temp;
        System.out.println("交换后的数为" + aaaa + aaa + aa + a);

    }
}
