package com.company.chongchongchong;

import java.util.Scanner;

//题目：取一个整数a从右端开始的4～7位。
//程序分析：可以这样考虑：
//(1)先使a右移4位。
//(2)设置一个低4位全为1,其余全为0的数。可用~(~0<<4)
//(3)将上面二者进行&运算。
public class Demo32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于七位的数");
        long l = scanner.nextLong();

        String s = Long.toString(l);
        char[] ch = s.toCharArray();
        int j = ch.length;
        if (j<7){
            System.out.println("请输入一个大于七位的数");
        }else{
            System.out.println(ch[j-4]+" "+ch[j-5]+" " + ch[j-6]+""+ch[j-7]);
        }

    }
}
