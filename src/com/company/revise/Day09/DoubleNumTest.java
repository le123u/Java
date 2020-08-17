package com.company.revise.Day09;

import java.util.ArrayList;
import java.util.List;

public class DoubleNumTest {
    public static void main(String[] args) {
        ArrayList<Integer> srcList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            srcList.add(i);
        }
        List<Integer> evenNum = getEvenNum(srcList);
        System.out.println(evenNum);


    }
    public static List<Integer> getEvenNum(List<Integer> list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer%2==0){
                arrayList.add(integer);
            }
        }
        return arrayList;
    }
}
