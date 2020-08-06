package com.company.Day12.Day12_02.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyBirthHowDays {
    public static void main(String[] args) throws ParseException {
        function();

        }
    public static void function() throws ParseException {

        // 获取当前时间对应的毫秒值
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        // 获取出生日期到现在的毫秒值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生日期 格式yyyy-MM-dd");
        String i = scanner.nextLine();
        // 将i转化为Date对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(i);
        long time1 = parse.getTime();
        System.out.println(time1);

        // 相减
        long a = (time - time1);
        if(a < 0){
            System.out.println("小屁孩你还没出来呢，别出来了 回去吧");
        }else{
            System.out.println("我出生了" + a/1000/60/60/24 + "天");
        }

    }
}
