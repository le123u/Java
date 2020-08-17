package com.company.revise.Day03;

public class Demo04 {
    public static void main(String[] args) {
        int count = 0;
        int flag = 3;
       A:for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i ; j++) {
                if (i%j == 0)
                    //System.out.println("不是质数");
                    continue A;
                }
//           System.out.println(i);
          System.out.print(i+(++count%flag==0 ?" \n":"\t" ));
            }
        }
    }

