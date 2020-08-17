package com.company.revise.Day05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int a = random.nextInt(32) + 1;
            list.add(a);
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        printArrayList(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (i != list.size() - 1){
                System.out.print(integer + ",");
            }else{
                System.out.print(integer+"]");
            }
        }
    }
}
