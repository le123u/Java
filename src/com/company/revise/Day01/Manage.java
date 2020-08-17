package com.company.revise.Day01;

import java.util.ArrayList;

public class Manage extends User {
    public Manage(){

    }
    public Manage(String name,int leftMoney){
        super(name, leftMoney);
    }
    // 发红包
    public ArrayList<Integer> send(int totalMoney ,int count){
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getLeftMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
        }
        // 扣钱
        super.setLeftMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;
        redlist.add(last);

        return redlist;
    }
}
