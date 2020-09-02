package com.company.revise.luan.demo16.demo2;

public class Test {
    public static void main(String[] args) {
        FlyAble f = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我要起飞了");
            }
        };
        f.fly();
    }
}
