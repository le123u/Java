package com.company.revise.Day14.demo03;

public class Sun extends Star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

    @Override
    public void shine(){
        System.out.println("sun:光照八分钟，达到地球");
    }
}
