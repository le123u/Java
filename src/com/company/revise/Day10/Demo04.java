package com.company.revise.Day10;

import java.util.Calendar;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
//        System.out.println(date);
        Date date1 = new Date();
        long time = date1.getTime();
        System.out.println(time);
    }
}
