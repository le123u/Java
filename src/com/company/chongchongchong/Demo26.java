package com.company.chongchongchong;

import java.util.Scanner;

// 题目：请输入星期几的第一个字母来判断一下是星期几，
// 如果第一个字母一样，则继续 判断第二个字母。
//程序分析：用情况语句比较好，如果第一个字母一样，
// 则判断用情况语句或if语句判断第二个字母。
public class Demo26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个日期英文");
        String s = scanner.next();
        String[] split = s.split("");


        switch (split[0]){
            case "M" :
                System.out.println("今天是星期一");
                break;
            case "T":
                if (split[1] == "u"){
                    System.out.println("今天是星期二");
                }else{
                    System.out.println("今天是星期四");
                }
                break;
            case "W":
                System.out.println("今天是星期三");
                break;
            case "F":
                System.out.println("今天是 星期五");
                break;
            case "S":
                if (split[1] == "a"){
                    System.out.println("今天是星期六");
                }else{
                    System.out.println("今天是星期日");
                }
            default:
                System.out.println("请输入正确的日期英文");
                break;
        }

    }
}
