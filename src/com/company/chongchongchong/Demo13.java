package com.company.chongchongchong;

import java.util.concurrent.LinkedTransferQueue;

// 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，
// 请问该数是多少？
//程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上168后再开方，
public class Demo13 {
    public static void main(String[] args) {
        int a;
        int b;
        for (int i = 0; i < 100000; i++) {
           a = i + 100;
           b = a + 168;

            if ((int) Math.sqrt(b)*Math.sqrt(b) == b && (int) Math.sqrt(a)*Math.sqrt(a) == a){
                System.out.println(i);
            }

          
        }


    }
}
