package com.company.Day12.homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) {
        // 用程序判断2018年2月14日是星期几。
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,01,14);

        Date time = calendar.getTime();
        int i = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(i);

        System.out.println(Calendar.DAY_OF_MONTH);

    }

}
