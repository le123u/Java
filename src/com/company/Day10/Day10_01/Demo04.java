package com.company.Day10.Day10_01;

public class Demo04 {
    public static void main(String[] args) {
        int d1 = Math.abs(-5); //abs 绝对值
        System.out.println(d1);

        double d2 = Math.ceil(3.3);// 返回大于等参数最小整数
        System.out.println(d2);

        double d3 = Math.floor(-3.3); //返回小于等于参数的最小整数
        System.out.println(d3);

        long round = Math.round(5.5); // 四舍五入
        System.out.println(round);

        // 计算 -10.8 到 5.9之间 绝对值大于6小于2.1 的整数有多少个
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (double i = Math.ceil(min); i <= Math.floor(max) ; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }

        }
        System.out.println(count);
    }
}
