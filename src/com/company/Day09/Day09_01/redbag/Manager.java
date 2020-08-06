package com.company.Day09.Day09_01.redbag;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){

    }
    public Manager(String name,int leftMoney){
        super(name,leftMoney);
    }

    // 发红包
    public ArrayList<Integer> send(int totalMoney , int count){

        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getLeftMoney();
        // 判断
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
        }

        // 扣钱
        super.setLeftMoney(leftMoney - totalMoney);

        // 每人发的钱
        int avg = totalMoney / count;
        // 除不开的钱
        int mod = totalMoney % count;

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);

        }
        int last = avg + mod;
        redList.add(last);

        return redList;

    }
}
