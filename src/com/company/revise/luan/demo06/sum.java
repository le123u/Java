package com.company.revise.luan.demo06;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个词");
        int i = scanner.nextInt();
        System.out.println("请输入第二个词");
        int i1 = scanner.nextInt();
       int sum = i + i1;
        System.out.println(sum);
    }
}
