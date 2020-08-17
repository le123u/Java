package com.company.revise.Day05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(100);
            list.add(i1);
        }
        ArrayList<Integer> list1 = smallList(list);
        System.out.println(list1);
    }

    public static ArrayList<Integer> smallList(ArrayList<Integer> list) {

        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer%2 == 0){
                smallList.add(integer);
            }
        }

        return smallList ;
    }

}
