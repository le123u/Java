package com.company.revise.luan.demo18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo02 {
    public static void main(String[] args) throws ParseException {
        System.out.println(getLastDayOfMath("2020-08"));

    }
    public static String getLastDayOfMath(String yearmonth) throws ParseException {
        SimpleDateFormat ds = new SimpleDateFormat("yyyy-MM");
        Date date = ds.parse(yearmonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return ""+lastDay;

    }
    public static int lastDay(int year,int month){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
}
