package com.company.revise.luan.demo11;

import java.util.Arrays;

public class ddd {
    public static void main(String[] args) {
        String l = "qiiisfjci";
        char[] chars = l.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        for (int i = chars.length-1; i >=0 ; i--) {
            char aChar = chars[i];
            System.out.print(aChar);
        }
    }
}
