package com.company.ceshi.Test04;

import java.util.Scanner;

public class StringDemo03 {
    public static void main(String[] args) {
        // 需求：键盘录入一个字符串 统计字符串中大小写字母 数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组字符串：");
        String s = sc.nextLine();
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9'){
                num += 1;
            }else if (c >= 'a' && c <= 'z'){
                small += 1;
            }else if(c >= 'A' && c <= 'Z'){
                big += 1;
            }else{
                other += 1;
            }
        }
        System.out.println(small);
        System.out.println(big);
        System.out.println(num);
        System.out.println(other);
    }



}
