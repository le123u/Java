package com.company.Day09.Day09_01.redbag01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member(){

    }
    public Member(String userName,int leftMoney){
        super(userName,leftMoney);
    }

    // 成员收红包
    public void revise(ArrayList<Integer> list){

        // 随机红包
        Random random = new Random();
        int index = random.nextInt(list.size());

        // 收完红包后删除
        Integer removeMoney = list.remove(index);

        // 更新余额
        int leftMoney = super.getLeftMoney();

        // 余额剩余的钱
        int updateMoney = leftMoney + removeMoney;

        super.setLeftMoney(removeMoney);
    }
}
