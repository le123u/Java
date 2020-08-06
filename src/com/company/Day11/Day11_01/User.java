package com.company.Day11.Day11_01;

public class User {
//    String userName = "李四";
//    int age;

    // 显式初始化
   // final String  USERNAME = "张三";

    // 构造方法初始化
    final String USERNAME;
    private int age;

    public User(String username , int age) {
        this.USERNAME = username;
        this.age = age;
    }
}
