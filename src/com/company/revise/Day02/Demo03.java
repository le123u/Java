package com.company.revise.Day02;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-7的数字");
        int i = scanner.nextInt();
        if (i <= 7 && i >= 1){
            if (i==1){
                System.out.println("星期一");
            }else if(i==2){
                System.out.println("星期二");
            }else if(i ==3){
                System.out.println("星期三");
            }else if (i == 4){
                System.out.println("");
            }
        }else{
            System.out.println("请输入正确的数字");
        }
    }
}
