package com.company.Day13.Package;

public class BaoZhuang01 {
    public static void main(String[] args) {
        // 基本数据类型转换包装
//        Integer i = new Integer(4);
//        // 包装转换基本
//        int i1 = i.intValue();

        Integer i = 5; // 自动装箱
        i = i + 5; // 自动拆箱
        int a = 100;
        System.out.println("a的值" + a);

    }
}
