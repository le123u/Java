package com.company.revise.Day02;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i % 2 == 0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }
    }
}
