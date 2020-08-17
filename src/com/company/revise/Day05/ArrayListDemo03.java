package com.company.revise.Day05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo03 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList();
        Random random = new Random();
        int i = random.nextInt(3) + 1;
        for (int j = 0; j < 3; j++) {
            list.add(j);
        }
        printArray(list);
    }
    public static void printArray(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (i != list.size() - 1){
                System.out.print(integer+"@");
            }else{
                System.out.print(integer+"}");
            }
        }
    }
}
