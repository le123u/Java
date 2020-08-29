package com.company.revise.luan.demo08;

import java.util.ArrayList;
import java.util.Random;

public class dddd {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int i1 = random.nextInt(100) + 1;
            list.add(i1);
        }
        ArrayList<Integer> list1 = ouShu(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
    public static ArrayList<Integer> ouShu( ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0)
                list1.add(list.get(i));
        }
        return list1;
    }
}
