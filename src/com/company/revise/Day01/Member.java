package com.company.revise.Day01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(){

    }
    public Member(String name,int leftMoney){
        super(name, leftMoney);
    }

    // 收红包
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());

        Integer removeMoney = list.remove(index);

        int leftMoney = super.getLeftMoney();
        int updateMoney = leftMoney + removeMoney;
        super.setLeftMoney(updateMoney);
    }
}
