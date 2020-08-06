package com.company.Day09.Day09_01.redbag01;

public class User {

    private String userName;
    private int leftMoney;

    public User(){

    }
    public User(String userName , int leftMoney){
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    public String getUserName(){
        return userName;
    }
     public void setUserName(String userName){
        this.userName = userName;
    }
    public int getLeftMoney(){
        return leftMoney;
    }
    public void setLeftMoney(int leftMoney){
        this.leftMoney = leftMoney;
    }

    // 显示余额的方法 show
    public void show(){
        System.out.println("用户"+userName+"\t"+"余额为"+leftMoney);
    }
}
