package com.company.revise.luan.demo02;

public class Phone {
    String name;
    int price;
    String color;
    String type;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
}
