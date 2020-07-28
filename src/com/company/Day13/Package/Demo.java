package com.company.Day13.Package;

public class Demo {
    public static void main(String[] args) {
        // "123" 123
        // 基本类型转换String类型
        int a = 100;
        String b = "" + a;
        System.out.println(b);

        // String类型 转换基本数据类型
        // 包装类都有parseXxx静态方法 可以将字符串参数转换为对应的基本类型
        int i = Integer.parseInt("120");
    }
}
