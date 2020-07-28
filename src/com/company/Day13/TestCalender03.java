package com.company.Day13;

import java.util.Calendar;

public class TestCalender03 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_MONTH,2);
        calendar.add(Calendar.YEAR,-3);
        // 设置年
        int year = calendar.get(Calendar.YEAR);
        //  设置月 0-11
        int month = calendar.get(Calendar.MONTH) + 1;
        // 设置日
        int day = calendar.get(Calendar.DAY_OF_MONTH)  ;

        System.out.println(year+"年"+month+"月"+day+"日");

    }
}
