package com.company.Day12.Day12_02.DateAndTime;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        // 创建日期对象，返回当前时间
        System.out.println(date);
        // Mon Jul 27 15:19:06 CST 2020

        // 创建日期对象 把当前的毫秒值转换成日期对象
        System.out.println(new Date(0L));

        // 把日期对象转换为对应的时间毫秒值
        System.out.println(new Date().getTime());
        int i = 0;
        while (true){
            if (i  == 1000000){
                break;
            }
            i++;
        }
        System.out.println(new Date().getTime());
    }
}
