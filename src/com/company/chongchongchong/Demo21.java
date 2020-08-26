package com.company.chongchongchong;
// 题目：求1+2!+3!+...+20!的和
//程序分析：此程序只是把累加变成了累乘。
public class Demo21 {
    public static void main(String[] args) {
        Long temp = 1L;
        Long sum = 0L;
        for (int i = 1; i <= 20 ; i++) {
            temp *= i;
            sum += temp;
        }
        System.out.println(sum);
    }
}
