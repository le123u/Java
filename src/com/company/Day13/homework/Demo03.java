package com.company.Day13.homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 * 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        int[] arr = new int[list.size()];

//        for (int i = 0; i < list.size(); i++) {
////            Integer s = list.get(i);
////            arr[i] = s;
////        }

        Object[] obj = list.toArray();

        String s1 = Arrays.toString(obj);
        System.out.println(s1);
    }


}
