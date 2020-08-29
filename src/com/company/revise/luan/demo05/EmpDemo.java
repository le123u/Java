package com.company.revise.luan.demo05;

public class EmpDemo {
    private String name;
    private String zhiwei;
    private int number;
    private int money;

    public EmpDemo() {
    }

    public EmpDemo(String name, String zhiwei, int number, int money) {
        this.name = name;
        this.zhiwei = zhiwei;
        this.number = number;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
