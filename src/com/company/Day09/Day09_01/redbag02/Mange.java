package com.company.Day09.Day09_01.redbag02;

import java.util.ArrayList;

public class Mange extends User {

    public Mange(){

    }
    public Mange(String userName,int leftMoney){
        super(userName,leftMoney);
    }

    // 发红包
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = getLeftMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
        }

        int avg = totalMoney / 3;
        int mod = totalMoney % 3;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int lastMoney = avg + mod;
        redList.add(lastMoney);

        setLeftMoney(leftMoney - totalMoney);


        return redList;
    }
}
