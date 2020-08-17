package com.company.chongchongchong;

import java.util.Scanner;

// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class Demo07_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String s = scanner.nextLine();
        int num = 0;
        int zimu = 0;
        int kong = 0;
        int outer = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i]<='9'){
                num++;
            }else if ( c[i] == ' '){
                kong++;
            }else if ((c[i] >= 'a' && c[i] <= 'z') || (c[i]>='A' && c[i]<='Z')){
                zimu++;
            }else{
                outer++;
            }
        }
        System.out.println("数字有"+num+"个,字母有"+zimu+"个，空格有"+kong+"个,其他字符"+outer+"个");

    }

}
