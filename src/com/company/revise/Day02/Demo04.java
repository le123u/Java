package com.company.revise.Day02;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个整数: ");
        int a = sc.nextInt();
        System.out.println("请录入第二个整数: ");
        int b = sc.nextInt();
        System.out.println("请录入第三个整数: ");
        int c = sc.nextInt();

        int temp = (a>b?a:b);
        int max =(temp > c ? temp:c);
        System.out.println(max);
    }
}
