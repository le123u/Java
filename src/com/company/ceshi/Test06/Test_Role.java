package com.company.ceshi.Test06;

public class Test_Role {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("M416", 200);

        Armour armour = new Armour("三级甲", 200);

        Role role = new Role();

        // 设置武器属性
        role.setWp(weapon);

        // 设置穿戴属性
        role.setAr(armour);

        role.attack();
        role.wear();
    }
}
