package com.company.revise.sum.computer;

public class Computer {

    public void run(){
        System.out.println("电脑运行起来");
    }
    public void down(){
        System.out.println("电脑关机了");
    }

    public void useUSB(USB usb){
        if (usb != null){
            usb.open();
            if (usb instanceof Mouse){
                Mouse m = (Mouse) usb;
                m.click();
            }else if (usb instanceof KeyBorad){
                KeyBorad k = (KeyBorad) usb;
                k.input();
            }else{
                usb.close();
            }
        }
    }
}
