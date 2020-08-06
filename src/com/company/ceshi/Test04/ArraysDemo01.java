package com.company.ceshi.Test04;

import java.util.Arrays;

public class ArraysDemo01 {
    public static void main(String[] args) {
        // 需求：字符升序排序 并且倒序打印

        // 字符升序排序 并且倒叙打印
        String line = "ASDFGERzxcvbnq";
        char[] s = line.toCharArray();
        System.out.println(s);


        System.out.println("排序前"+Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("排序后"+ Arrays.toString(s));

        // 反向遍历输出
        for (int i = s.length-1; i >= 0; i--) {
            System.out.print(s[i]+" ");

        }
    }
}
