package com.company.revise.Day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo05 {
    public static void main(String[] args) throws ParseException {
        String lastDayOfMonth = getLastDayOfMonth("2020-06");
        System.out.println(lastDayOfMonth);
        int lastDay = lastDay(2020, 7);
        System.out.println(lastDay);
    }

    public static String getLastDayOfMonth(String yearmonth) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(yearmonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return "" + lastDay;
    }
    public static int lastDay(int year,int month){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
}
