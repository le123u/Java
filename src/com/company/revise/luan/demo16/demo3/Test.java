package com.company.revise.luan.demo16.demo3;

public class Test {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("m416", 200);
        Armour armour = new Armour("三级甲", 200);
        Role role = new Role();
        role.setWp(weapon);
        role.setAr(armour);
        role.attack();
        role.wear();
    }
}
