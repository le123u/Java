package com.company.revise.sum.redbag;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member(){

    }
    public Member(String name,int leftMoney){
        super(name,leftMoney);
    }

    public void revise(ArrayList<Integer> list){
        Random random = new Random();
        int i = random.nextInt(list.size());

        Integer removeMoney = list.remove(i);

        int leftMoney = super.getLeftMoney();

        int updateMoney = leftMoney+removeMoney;

        super.setLeftMoney(updateMoney);
    }



}
