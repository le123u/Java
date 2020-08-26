package com.company.chongchongchong;
// 题目：求100之内的素数
public class Demo27 {
    public static void main(String[] args) {
      A:  for (int i = 2; i < 100; i++) {
            if (i == 2) System.out.println(i);
            if (i % 2 == 0){
                continue;
            }else{
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0){
                        continue A;
                    }
            }
                System.out.println(i);
            }

        }

    }
}
