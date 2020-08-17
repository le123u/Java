package com.company.revise.Day01.computer;

public class keyBoard implements USB {
    @Override
    public void start() {
        System.out.println("键盘开启");
    }

    @Override
    public void end() {
        System.out.println("键盘关闭");

    }
    public void type(){
        System.out.println("劈里啪啦的敲");
    }
}
