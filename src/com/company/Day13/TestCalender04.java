package com.company.Day13;

import java.util.Calendar;
import java.util.Date;

public class TestCalender04 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime(); // Tue Jul 28 09:14:02 CST 2020
        System.out.println(date);

        Date date1 = new Date(); // Tue Jul 28 09:14:02 CST 2020
        long time = date1.getTime(); // 1595898917910
        System.out.println(time);
    }
}
