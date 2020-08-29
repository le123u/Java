package com.company.revise.luan.demo07;

import java.util.Random;
import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入你猜的数字");
            int i = scanner.nextInt();
            if (i > a){
                System.out.println("da");
            }else if (i < a){
                System.out.println("xiao");
            }else {
                System.out.println("zhenghao ");
                break;
            }
        }
    }
}
