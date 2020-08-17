package com.company.revise.Day01;

public class User {
    private String name;
    private int leftMoney;

    public User() {
    }

    public User(String name, int leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("用户"+name+"\t"+"余额为"+leftMoney);
    }
}
