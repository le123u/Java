package com.company.ceshi.Test03;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo01 {
    public static void main(String[] args) {
        // 需求：游戏开始时，会随机生成一个1-100之间的整数 number 。
        // 玩家猜测一个数字 guessNumber ，会与 number 作比较，
        // 系统提示大了或者小了，直到玩家猜中，游戏结束

        Random random = new Random();
        int number = random.nextInt(100 ) + 1;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNumber = scanner.nextInt();
            if (guessNumber > number){
                System.out.println("不好意思你猜大了");
            }else if (guessNumber < number){
                System.out.println("不好意思你猜小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
