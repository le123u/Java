package com.company.chongchongchong;

import java.util.Scanner;

// 题目：一个偶数总能表示为两个素数之和。
public class Demo44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于二的偶数 ");
        int n;
        n = scanner.nextInt();
        if (n % 2 != 0 || n < 2) {
            System.out.println("请输入一个大于二的偶数");
            n = scanner.nextInt();
        }
        for (int i = 2; i < n; i++) {
            int j = n - i;
            if (isPrime(i) & isPrime(j)) {     //判断i和j是否均为素数
                System.out.println("偶数" + n + "为素数" + i + "和素数" + j + "的和");
            }
        }
    }

    private static boolean isPrime(int x) {
        // 声明一个返回值
        boolean isPrime = true;          //默认为素数
        // 利用数学方法，遍历2-根号x，判断是否有其他因数
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;          //如果有，就不是素数
                break;
            }
        }
        return isPrime;
    }
}
