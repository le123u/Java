package com.company.chongchongchong;

import java.util.Scanner;

// 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千
public class Demo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int i = scanner.nextInt();
        if (i >= 10000 && i <= 99999){
            int wan = i / 10000;
            int qian = i%10000/1000;
            int bai = i%1000/100;
            int shi = i%100/10;
            int ge = i%10;
            if (ge == wan && qian == shi){
                System.out.println("它是回文数");
            }else{
                System.out.println("他不是回文数");
            }
        }else{
            System.out.println("请输入正确的数字");
        }
    }
}
