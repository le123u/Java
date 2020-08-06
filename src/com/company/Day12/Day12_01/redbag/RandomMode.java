package com.company.Day12.Day12_01.redbag;

import com.company.Day12_01.redbag.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        /**
         * 随机分配 totalMoney 单位是分
         * 最少1分钱 最多不超过剩下金额平均数的2倍，应该越发越少
         * 随即金额公式：1 + random.nextInt(leftMoney/leftCount*2)
         */

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // 随机发前 n-1个 最后一个不需要随机
        for (int i = 0; i < totalCount - 1; i++) {
            // 随机出来的金额
            int money = random.nextInt(leftMoney/leftCount*2) + 1;

            // 将随机出来的金额 放进集合中
            list.add(money);
            // 越发越少
            leftCount-- ; //剩下的分次每次减一
            leftMoney -= money;
        }
        // 处理最后一个
        list.add(leftMoney);

        return list;
    }
}
