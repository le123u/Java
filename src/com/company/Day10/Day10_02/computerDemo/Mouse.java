package com.company.Day10.Day10_02.computerDemo;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启，小灯一闪一闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
    void click(){
        System.out.println("鼠标单击");
    }
}
