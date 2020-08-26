package com.company.chongchongchong;
// 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
// 求出这个数列的前20项之和。
//程序分析：请抓住分子与分母的变化规律。
public class Demo20 {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.0;
        double sum = 2.0;
        for (int i = 1; i <= 19 ; i++) {
            b = a;
            a = a + b;
            sum += a/b ;

        }
        System.out.println(sum);

    }
}
