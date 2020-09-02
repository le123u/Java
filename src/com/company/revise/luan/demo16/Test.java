package com.company.revise.luan.demo16;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> srcList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            srcList.add(i);
        }
        List<Integer> list = getEvenNum(srcList);
        System.out.println(list);
    }

    public static List<Integer> getEvenNum(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 2 == 0){
                list1.add(integer);
            }
        }
        return list1;
    }
}
