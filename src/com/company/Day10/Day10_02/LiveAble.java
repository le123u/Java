package com.company.Day10.Day10_02;

public interface LiveAble {
    // 定义抽象方法
    public abstract void eat();
    public abstract void sleep();

    // 静态方法
    public static void run(){
        System.out.println("嗷嗷跑");
    }
    // 默认方法
    public default void fly(){
        System.out.println("飞飞飞");
        func1();
        func2();
    }

    // 私有方法 只有默认方法可以调用它
    // 私有静态方法 默认方法、静态方法可以调用他
    void func1(){
        System.out.println("func1");
    }
    void func2(){
        System.out.println("func2");
    }

}
