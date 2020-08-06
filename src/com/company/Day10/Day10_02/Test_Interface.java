package com.company.Day10.Day10_02;

public class Test_Interface {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.eat();
        a.sleep();

        // 调用默认方法
        a.fly();

        LiveAble.run();


    }
}
