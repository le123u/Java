package com.company.lianxieveryday.computerDemo;

public class Computer {

    public void run (){
        System.out.println("指示灯闪烁，电脑开启");
    }

    public void shutDown(){
        System.out.println("电脑关机");
    }

    public void useUSB(USB usb){
        if (usb != null){
            usb.start();
            if (usb instanceof Mouse){
                Mouse m = (Mouse) usb;
                m.click();
            }
            if (usb instanceof KeyBoard){
                    KeyBoard kb = (KeyBoard) usb;
                    kb.type();
            }

        }else{
            usb.end();
        }
    }

}
