package com.company.Day09.Day09_01;

public class User {
    // 用户名
    private String userName;

    // 余额
    private int leftMoney;

    // 无参构造方法
    public User() {
    }
    // 有参构造方法

    public User(String userName, int leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    // get set方法

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("用户" + userName + "\t    " + "余额为" + leftMoney + "元");
    }
}
