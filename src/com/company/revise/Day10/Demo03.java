package com.company.revise.Day10;

import java.util.Calendar;

public class Demo03 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_MONTH,2);
        calendar.add(Calendar.YEAR,-3);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int da = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"年"+month+"月"+da);
    }
}
