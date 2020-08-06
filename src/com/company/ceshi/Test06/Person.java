package com.company.ceshi.Test06;

public class Person {
    private boolean live = true;
    //创建内部类
    public  class Heart{
        public void jump(){
            if (live){
                System.out.println("心扑通扑通跳");
            }else {
                System.out.println("over");
            }
        }
    }

    public boolean isLive(){
        return live;
    }
    public void setLive(boolean live){
        this.live = live;
    }
}

