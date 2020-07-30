package com.company.Day12.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
public class Demo03 {
    public static void main(String[] args) throws ParseException {
        String s = "2018-03-04";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(s);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = dateFormat1.format(parse);
        System.out.println(format);
    }
}
