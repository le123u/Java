package com.company.ceshi.Test06;

public class Role {

    private String name;
    private int sid;
    private int blood; //生命值

    // 添加武器属性
    private Weapon wp;

    // 添加装备属性
    private Armour ar;

    // get set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }

    // 添加攻击方法
    public void attack(){
        System.out.println("使用了"+wp.getName()+"伤害了"+wp.getHurt()+"值");
    }

    // 穿戴盔甲方法
    public void wear(){
        // 增加血量
        this.blood += ar.getProtect();
        System.out.println("穿戴了"+ar.getName()+",增加了"+ar.getProtect()+"血量");
    }
}
