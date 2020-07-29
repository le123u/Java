package com.company.Day13.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);


        System.out.println(listTest(list,2));
    }
    public static int listTest(ArrayList<Integer> list, Integer s){
        Iterator<Integer> iterator = list.iterator();
        int index = -1;
        while (iterator.hasNext()){
            ++ index;
            Integer next = iterator.next();

            if(next == s){
                return index;
            }
        }
        return -1;

    }
}
