package com.company.chongchongchong;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：
 * 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class Demo05_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        int i = scanner.nextInt();
        if (i<= 100 && i >0){
            switch (i/10){
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                case 7:
                case 6:
                    System.out.println("B");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("C");
                    break;
                default:
                    break;

            }
        }else{
            System.out.println("请输入有效分数");
        }


    }
}
