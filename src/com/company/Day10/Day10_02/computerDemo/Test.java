package com.company.Day10.Day10_02.computerDemo;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.run();
        // 父类引用指向子类对象
        USB m = new Mouse();
        // 电脑使用鼠标
        c.useUSB(m);

        USB kb = new KeyBoard();
        c.useUSB(kb);

        c.shutDown();

    }
}
