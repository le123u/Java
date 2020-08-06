package com.company.Day09.Day09_02;

public class Demo01 {
    public static void main(String[] args) {
        String s = "helloworld";
        // 获取字符串的长度
        System.out.println(s.length());
        System.out.println("-----------------------");

        // 将指定的字符串拼接到该字符串的末尾
        String s2 = s.concat("**haha");
        System.out.println(s2);

        // 获取指定索引的字符
        System.out.println(s.charAt(0));

        // 返回第一次出现的索引
        System.out.println(s.indexOf("l"));

        // 从start开始 包含start以后的元素
        System.out.println(s.substring(0));

        // [) 左闭右开
        System.out.println(s.substring(0, s.length()));
    }
}
