package com.company.chongchongchong;

import java.util.Scanner;

// 输入三个整数x,y,z，请把这三个数由小到大输出。
public class Demo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入X");
        int x = scanner.nextInt();
        System.out.println("请输入Y");
        int y = scanner.nextInt();
        System.out.println("请输入Z");
        int z = scanner.nextInt();

        int temp = x > y ? x : y;
        int max = temp > z ? temp :z;
        System.out.println(max);
    }
}
