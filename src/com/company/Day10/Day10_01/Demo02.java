package com.company.Day10.Day10_01;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // 键盘录入一个字符串数据 统计出大写字母 小写字母 数字
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串数据：");
        String s1 = s.nextLine();
        int num = 0;
        int daxie = 0;
        int xiaoxie = 0;
        int other = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(c >= '0' && c <= '9'){
                num += 1;
            }else if(c >= 'A' && c <= 'Z'){
                daxie += 1;
            }else if(c >= 'a' && c <= 'z'){
                xiaoxie += 1;
            }else{
                other += 1;
            }

        }
        System.out.println("大写字母有"+daxie+"个");
        System.out.println("小写字母有"+xiaoxie+"个");
        System.out.println("数字有"+num+"个");
        System.out.println("其他字符有"+other+"个");
    }
}
