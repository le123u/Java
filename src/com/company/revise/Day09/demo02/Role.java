package com.company.revise.Day09.demo02;

public class Role {

    private int id;
    private int blood;
    private String name;

    private Weapon wp;
    private Armour ar;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("使用"+wp.getName()+",生命值增加"+wp.getHurt());
    }

    public void wear(){
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+",生命值增加"+ar.getProtect());
    }
}
