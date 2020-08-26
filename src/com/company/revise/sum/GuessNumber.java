package com.company.revise.sum;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数字");
            int i1 = scanner.nextInt();
            if (i1 > i){
                System.out.println("你猜大了");
            }else if (i1 < i){
                System.out.println("你猜小了");
            }else{
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
