package com.company.revise.luan.demo06;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个词");
        int i = scanner.nextInt();
        System.out.println("请输入第二个词");
        int i1 = scanner.nextInt();
        System.out.println("请输入第三个词");
        int i2 = scanner.nextInt();

        int t = i > i1 ? i:i1;
        int max = t > i2 ? t:i2;
        System.out.println(max);
    }
}
