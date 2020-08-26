package com.company.revise.sum.redbag;

import java.util.ArrayList;

public class Manage extends User {
    public Manage(){}
    public Manage(String name,int leftMoney){
        super(name,leftMoney);
    }


    public ArrayList<Integer> send(int count,int money){
        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = super.getLeftMoney();
        if (money > leftMoney){
            System.out.println("余额不足");
        }

        super.setLeftMoney(leftMoney - money);

        int avg = money/count;
        int mod = money%count;

        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }

        int last = avg + mod;
        list.add(last);

        return list;
    }
}
