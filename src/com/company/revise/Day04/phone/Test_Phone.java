package com.company.revise.Day04.phone;

public class Test_Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.pinpai = "iphone";
        phone.xinghao = "iphone8plus";
        phone.price = 4800;
        phone.color = "深空灰";

        System.out.println(phone.pinpai);
        System.out.println(phone.xinghao);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println();
        phone.call("mayun");
        phone.send();
    }
}
