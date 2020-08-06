package com.company.Day11.Day11_01.IntefaceDemo;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        ArrayList<Integer> doubleNumList = getDoubleNum(list);
        System.out.println(doubleNumList);



    }

    public static ArrayList<Integer> getDoubleNum(ArrayList<Integer> list){
        ArrayList<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                doubleList.add(list.get(i));
        }
        return doubleList;
    }
}
