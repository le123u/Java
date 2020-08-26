package com.company.revise.sum.computer;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");

    }

    public void click(){
        System.out.println("鼠标疯狂点击");
    }
}
