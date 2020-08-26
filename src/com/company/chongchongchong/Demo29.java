package com.company.chongchongchong;

import java.util.Scanner;

// 题目：求一个3*3矩阵对角线元素之和
//程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
public class Demo29 {
    public static void main(String[] args) {
        int[][] arr =new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               arr[i][j] = scanner.nextInt();

                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
