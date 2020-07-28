package com.company.Day13;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
       // 创建calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // 设置年
        int year = calendar.get(Calendar.YEAR);
        //  设置月 0-11
        int month = calendar.get(Calendar.MONTH) + 1;
       // 设置日
        int day = calendar.get(Calendar.DAY_OF_MONTH)  ;

        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
