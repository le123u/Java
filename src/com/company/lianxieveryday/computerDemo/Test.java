package com.company.lianxieveryday.computerDemo;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();

        c.run();

        USB mouse = new Mouse();
        c.useUSB(mouse);

        USB keyBoard = new KeyBoard();
        c.useUSB(keyBoard);

        c.shutDown();
    }
}
