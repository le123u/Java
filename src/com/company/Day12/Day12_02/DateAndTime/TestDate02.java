package com.company.Day12.Day12_02.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate02 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat df =
                new SimpleDateFormat("yyyy年MM月dd日 ");
        String str = df.format(date);
        System.out.println(str);

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        String format = simpleDateFormat.format(date1);
        System.out.println(format);
    }
}
