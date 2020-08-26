package com.company.chongchongchong;

import java.util.Scanner;

// 题目：输入某年某月某日，判断这一天是这一年的第几天？
//程序分析：以3月5日为例，应该先把前两个月的加起来，
// 然后再加上5天即本年的第几天，特殊情况，
// 闰年且输入月份大于3时需考虑多加一天。
public class Demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年月日");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        if (year%400 == 0 || (year%4==0&&year%100!=0)){
            int[] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
            for (int i = 1; i < month ; i++) {
                sum1 = sum1 +arr[i];
            }
            sum2 = sum1 + day;
        }else{
            int[] arr1 = {31,28,31,30,31,30,31,31,30,31,30,31};
            for (int i = 1; i < month ; i++) {
                sum1 = sum1 +arr1[i];
            }
            sum2 = sum1 + day;
        }

        System.out.println(sum2);
    }
}
