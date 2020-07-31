package com.company.Day16.singletonlanhandemo;

// 顾名思义 就是实例在用到的时候去创建，比较懒
// 延迟初始化，

public class Singleton {
    private  static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        // 特点 只是第一次生成对象，效率较高
        if (instance == null);{
            instance = new Singleton();
        }
        return instance;
    }
}
