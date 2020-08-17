package com.company.revise.Day01.computer;

public class Mouse implements USB {
    @Override
    public void start() {
        System.out.println("鼠标开启");
    }

    @Override
    public void end() {

        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("疯狂敲击");
    }
}
