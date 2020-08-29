package com.company.revise.luan.demo12;
// 计算再-10.8 到 5.9之间，绝对值大于等于6或者小于2.1的整数有多少个
public class dd {
    public static void main(String[] args) {
       double max = 5.9;
       double min = -10.8;
       int count = 0;
        for (double i = Math.ceil(min); i< max;i++ ){
            if (Math.abs(i) >= 6 || Math.abs(i) <2.1){
                count++;
            }
        }
        System.out.println(count);

    }
}
