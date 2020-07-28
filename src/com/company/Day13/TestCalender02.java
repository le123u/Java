package com.company.Day13;

import java.util.Calendar;

public class TestCalender02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

       calendar.set(Calendar.YEAR,1998);
        System.out.println(calendar.get(Calendar.YEAR)+"年"
                +(calendar.get(Calendar.MONTH) + 1)+"月"
                +calendar.get(Calendar.DAY_OF_MONTH)+"日");
    }
}
