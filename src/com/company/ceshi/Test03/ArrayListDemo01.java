package com.company.ceshi.Test03;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 需求：生成6个1~33之间的随机整数,添加到集合,并遍历
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);

        }
        System.out.println(list);
    }
}
