package com.company.revise.Day06;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
       String arr ="fafdacasaa";
        char[] chars = arr.toCharArray();
        System.out.println(chars);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        for(int i = chars.length-1 ; i >= 0 ; i--){
            System.out.print(chars[i]);
        }


    }
}
