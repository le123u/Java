package com.company.Day10.Day10_02.computerDemo;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启，小彩灯敖敖闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，小彩灯熄灭");
    }

    void type(){
        System.out.println("疯狂敲击");
    }
}
