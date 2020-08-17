package com.company.revise.Day01.computer;

public class Computer {
    public void run(){
        System.out.println("电脑开启");
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
            if (usb instanceof keyBoard){
                keyBoard k = (keyBoard) usb;
                k.type();
            }
        }else {
            usb.end();
        }
    }
}
