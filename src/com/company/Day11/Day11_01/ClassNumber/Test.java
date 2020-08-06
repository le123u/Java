package com.company.Day11.Day11_01.ClassNumber;

public class Test {
    public static void main(String[] args) {
        Weapon WP = new Weapon("98k", 9999);

        Armour armour = new Armour("三级甲", 200);

        Role role = new Role();

        //设置武器
        role.setWp(WP);

        //设置防御
        role.setAr(armour);

        // 攻击
        role.attack();

        // 防御
        role.wear();
    }
}
