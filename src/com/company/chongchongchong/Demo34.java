package com.company.chongchongchong;

import java.util.Scanner;

// 题目：输入3个数a,b,c，按大小顺序输出。
// 程序分析：利用指针方法。
public class Demo34 {
    public static void main(String[] args) {
        System.out.print("请输入3个数：");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a<b){
            int t = a;
            a = b;
            b = t;
        }
        if(a<c){
            int t = a;
            a = c;
            c = t;
        }
        if(b<c){
            int t = b;
            b = c;
            c = t;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
