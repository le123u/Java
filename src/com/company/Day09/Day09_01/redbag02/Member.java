package com.company.Day09.Day09_01.redbag02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member(){

    }
    public Member(String userName,int leftMoney){
        super(userName,leftMoney);
    }

    // 收红包
    public void revise(ArrayList<Integer> redList){

        Random random = new Random();
        int index = random.nextInt(redList.size());

        Integer removeMoney = redList.remove(index);


        int updateMoney = ( getLeftMoney() + removeMoney);


        setLeftMoney(updateMoney);
    }
}
