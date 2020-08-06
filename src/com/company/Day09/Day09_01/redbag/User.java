package com.company.Day09.Day09_01.redbag;

public class User {

    // 用户名
    private String name;

    // 余额
    private int leftMoney;

    // 构造方法
    public User(){

    }

    public User(String name, int leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }



    // get set 方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLeftMoney(){
        return leftMoney;
    }
    public void setLeftMoney(int leftMoney){
        this.leftMoney= leftMoney;
    }

    // 显示余额show方法
    public  void show(){

        System.out.println("用户" + name + "\t" + "余额为" + leftMoney);
    }


}
