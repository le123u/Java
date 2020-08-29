package com.company.revise.luan.demo09;

import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String s = scanner.nextLine();
        int num = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9'){
                num+=1;
            }else if (c >= 'A' && c <= 'Z'){
                m += 1;
            }else if (c >= 'a' && c <= 'z'){
                n += 1;
            }else {
                o += 1;
            }
        }
        System.out.println(num );
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
    }
}
