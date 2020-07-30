package com.company.Day12.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,
 * 如2088-08-08 08:08:08。
 */
public class Demo02 {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);

    }
}
