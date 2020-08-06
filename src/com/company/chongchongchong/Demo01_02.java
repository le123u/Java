package com.company.chongchongchong;

import java.util.Scanner;

public class Demo01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int n = scanner.nextInt();
        System.out.println("第"+n+"个月兔子有"+fun(n)+"对");
    }
    private static int fun(int n){
        if (n==1 || n==2){
            return  1;
        }else{
            return fun(n-1)+fun(n-2);
        }
    }
}
