package com.company.Day15.ExceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) throws ParseException {
        String s = "1994-01-01";
        timeFormat(s);
    }
    public static void timeFormat(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
