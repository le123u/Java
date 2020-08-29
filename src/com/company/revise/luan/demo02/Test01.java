package com.company.revise.luan.demo02;

public class Test01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name = "iphone8p";
        phone.price = 4800;
        phone.color = "深空灰";
        phone.type = "苹果";
//        System.out.println(phone.name);
//        System.out.println(phone.price);
//        System.out.println(phone.color);
//        System.out.println(phone.type);
        show(phone);
        phone.call("刘东东");
        phone.sendMessage();
    }
    public static void show(Phone p){
        System.out.println(p.name+p.color+p.price+p.type);
    }
}
