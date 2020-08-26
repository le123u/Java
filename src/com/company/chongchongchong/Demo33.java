package com.company.chongchongchong;

// 题目：打印出杨辉三角形（要求打印出10行如下图）
//程序分析：
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1
// 1 5 10 10 5 1
public class Demo33 {
    public static void main(String[] args) {
        int[] a = new int[11];
        int num = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
                for (int j = 1; j <= i+1; j++) {
                    int c = a[j];
                    a[j] = num + c;
                    num = c;
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }




    }
}
