package com.company.ceshi.Test01;

public class Phone {

    // 成员变量
    // 品牌
    String paizi;
    // 颜色
    String color;
    // 价格
    int price;

    // 成员方法
    // 打电话的方法
    public void call(){
        System.out.println("铃铃铃");
    }
    // 给马云发短信的方法
    public void send(String name){
        System.out.println("给"+name+"发短信");
    }
}
