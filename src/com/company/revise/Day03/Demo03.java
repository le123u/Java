package com.company.revise.Day03;

import java.util.Random;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        while(true){
            System.out.println("请输入你要猜的数字");
            int i1 = scanner.nextInt();
            if (i1> i){
                System.out.println("caidal");
            }else if(i1 < i){
                System.out.println("caixiaol");
            }else{
                System.out.println("猜对了");
                break;
            }
        }

    }
}
