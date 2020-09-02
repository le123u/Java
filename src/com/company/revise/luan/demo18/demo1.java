package com.company.revise.luan.demo18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) throws ParseException {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance.getTime());
        Date date = new Date();
        System.out.println(date.getTime());

        instance.add(Calendar.YEAR,+1);
        instance.add(Calendar.MONTH,-1);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

        instance.set(Calendar.YEAR,1998);
        System.out.println(instance.get(Calendar.YEAR));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date parse = sdf.parse("2020-08");
        System.out.println(parse);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.setTime(parse);

    }
}
