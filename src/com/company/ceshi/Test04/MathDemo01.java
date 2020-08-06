package com.company.ceshi.Test04;

public class MathDemo01 {
    public static void main(String[] args) {
        //需求：计算再-10.8 到 5.9之间，绝对值大于等于6或者小于2.1的整数有多少个

        double max = -10.8;
        double min = 5.9;
        int count = 0;

        for (double i = Math.ceil(max); i <= Math.floor(min) ; i++) {
            if (Math.abs(i) >= 6 || Math.abs(i) <= 2){
                count+=1;
            }

        }
        System.out.println(count);


    }
}
