package com.company.Day12.Day12_02.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate03 {
    public static void main(String[] args) throws ParseException {
        String str = "2020年2月2日";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = df.parse(str);
        System.out.println(date);
    }
}
