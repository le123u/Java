package com.company.revise.Day09.demo02;

public class Test {
    public static void main(String[] args) {
        Weapon m14 = new Weapon("m14", 1212);
        Armour sanjijia = new Armour("sanjijia", 22);

        Role role = new Role();

        role.setWp(m14);
        role.setAr(sanjijia);

        role.attack();
        role.wear();
    }
}
