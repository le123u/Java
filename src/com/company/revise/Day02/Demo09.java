package com.company.revise.Day02;

public class Demo09 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 9999; i >= 1000; i--) {
            int ge = i%10;
            int shi = i%100/10;
            int bai = i%1000/10;
            int qian = i/1000;


            if(ge + bai*100 == shi*10 + qian*1000){
                System.out.print(i+" ");
                count++;
                if (count%5 == 0){
                    System.out.println();
                }

            }


        }
    }
}
