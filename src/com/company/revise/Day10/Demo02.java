package com.company.revise.Day10;

import java.util.Calendar;

public class Demo02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR,1998);
        System.out.println(calendar.get(Calendar.YEAR)+""
        +calendar.get(Calendar.MONTH)+1+""+calendar.get(Calendar.DAY_OF_MONTH));
    }
}
