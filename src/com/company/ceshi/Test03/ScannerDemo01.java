package com.company.ceshi.Test03;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        // 从键盘录入两个数并求和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数");
        int j = scanner.nextInt();
        int sum = i + j;
        System.out.println(i + "+" + j + "=" + sum );
    }
}
