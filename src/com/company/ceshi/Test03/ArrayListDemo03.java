package com.company.ceshi.Test03;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        // 需求：定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100);
            list.add(num);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer ss = list.get(i);
            if (ss % 2 == 0){

                list1.add(ss);
            }
        }
        System.out.println(list1);
    }
}
