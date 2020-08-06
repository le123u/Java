package com.company.Day09.Day09_01.redbag01;

import java.util.ArrayList;

// 群主发红包
public class Manage extends User {
    public Manage(){

    }
    public Manage(String userName, int leftMoney) {
        super(userName,leftMoney);
    }

    // 发红包
    public  ArrayList<Integer> send(int totalMoney,int count){

        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getLeftMoney();
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

        // 把最后一个钱加进去
        int lastMoney = avg + mod;
        redList.add(lastMoney);

        return redList;
    }
}
