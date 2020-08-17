package com.company.revise.Day01.computer;

import com.company.neibulei.NeiBuLei04.Com;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.run();
        USB mouse = new Mouse();
        c.useUSB(mouse);
        USB keyBord = new keyBoard();
        c.useUSB(keyBord);
        c.shutDown();
    }
}
