package com.company.revise.Day09;

public class Person {
    private boolean live = true;

    class Heart{
        public void jump(){
            if(live){
                System.out.println("心扑通扑通地跳");
            }else{
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
