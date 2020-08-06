package com.company.ceshi.Test01;

public class Test_Phone {
    public static void main(String[] args) {

        // 创建Phone类
        Phone phone = new Phone();

        // 给变量赋值
        phone.paizi = "苹果";
        phone.color = "灰色";
        phone.price = 4800;

        //输出变量
        System.out.println("手机品牌"+phone.paizi);
        System.out.println("手机颜色"+phone.color);
        System.out.println("手机价格"+phone.price);

        // 调用方法
        phone.call();
        phone.send("马云");
    }
}
