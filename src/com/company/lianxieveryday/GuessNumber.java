package com.company.lianxieveryday;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;



        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNumber = scanner.nextInt();

                if (number > guessNumber){
                    System.out.println("猜小了");
                }else if (number < guessNumber){
                    System.out.println("猜大了");
                }else{
                    System.out.println("恭喜你猜对了");
                    break;
                }



        }
    }
}
