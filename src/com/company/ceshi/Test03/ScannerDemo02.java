package com.company.ceshi.Test03;

import java.util.Scanner;

public class ScannerDemo02 {
    public static void main(String[] args) {
        // 输入三个数取最值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();
        int max;
        if(a>b){
            if(a>c){
                max = a;
            }else{
                max = c;
            }
        }else{
            max = b;
        }
        /**
         * int temp = (a > b ? a : b);
         * int max = (temp > c ? temp : c);
         */
        System.out.println(max);
    }
}
