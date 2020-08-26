package com.company.revise.sum.computer;



public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();

        USB mouse = new Mouse();
        computer.useUSB(mouse);

        KeyBorad keyBorad = new KeyBorad();
        computer.useUSB(keyBorad);


        computer.down();

    }
}
