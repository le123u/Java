package com.company.chongchongchong;

import java.util.Scanner;
//题目：利用条件运算符的嵌套来完成此题：
//        * 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
//        * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
public class Demo05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个分数");
        int score = scanner.nextInt();
        if(score<=100 && score >=0){
            String C = (score >= 90) ? "A":((score >= 60) ? "B" : "C");
            System.out.println(C);


        }else{
            System.out.println("请输入有效分数");
        }
    }
}
