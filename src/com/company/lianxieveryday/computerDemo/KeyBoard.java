package com.company.lianxieveryday.computerDemo;

public class KeyBoard implements USB {
    @Override
    public void start() {
        System.out.println("键盘开启");
    }

    @Override
    public void end() {
        System.out.println("键盘关闭");
    }

    public void type(){
        System.out.println("疯狂输入");
    }
}
