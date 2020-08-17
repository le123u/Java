package com.company.chongchongchong;
// 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class Demo11_01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 123; i < 432 ; i++) {
            int ge = i%10;
            int shi = i%100/10;
            int bai = i/100;
            if (ge != shi && ge != bai && shi!=bai){
                count++;

            }

        }
        System.out.println(count);
    }
}
