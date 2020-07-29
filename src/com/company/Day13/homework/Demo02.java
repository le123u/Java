package com.company.Day13.homework;

import java.util.ArrayList;

/**
 * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，
 * 并返回。()
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};


        System.out.println( change(arr));
    }
    public static ArrayList<Integer> change(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}
