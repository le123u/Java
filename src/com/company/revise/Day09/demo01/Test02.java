package com.company.revise.Day09.demo01;

public class Test02 {
    public static void main(String[] args) {
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我要起飞了");
            }
        });
    }

    public static void showFly(FlyAble f){
        f.fly();
    }
}
