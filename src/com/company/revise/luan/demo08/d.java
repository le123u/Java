package com.company.revise.luan.demo08;

import java.util.ArrayList;
import java.util.Random;

public class d {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int i1 = random.nextInt(33) + 1;
            arrayList.add(i1);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        printArray(arrayList);
    }
    public static void printArray(ArrayList<Integer> arrayList){
        System.out.print("[");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != arrayList.size()-1){
                System.out.print(arrayList.get(i)+",");
            }else{
                System.out.print(arrayList.get(i)+"]");
            }
        }
    }
}
