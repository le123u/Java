package com.company.Day09.Day09_02;

import java.util.Scanner;

public class StringAI {
    public static void main(String[] args) {
        // 价值一个亿的AI核心代码
        Scanner scanner = new Scanner(System.in);
        String str;
        while(true){
            str = scanner.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
            System.out.println(str);
        }

    }
}
