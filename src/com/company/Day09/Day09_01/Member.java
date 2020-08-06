package com.company.Day09.Day09_01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String userName, int leftMoney) {
        super(userName, leftMoney);
    }

    // 收红包
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());


        // 红包收完之后删除
        //   Integer money = list.get(index);
        Integer removeMoney = list.remove(index);

        // 更新余额
        int leftMoney = super.getLeftMoney();
        int updateMoney = leftMoney + removeMoney;
        super.setLeftMoney(updateMoney);

    }
}
