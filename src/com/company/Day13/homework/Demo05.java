package com.company.Day13.homework;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<String> al),
 * 要求使用isEmpty()判断al里面是否有元素。
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("s");
        list.add("s");
        list.add("s");
        list.add("s");
        listTest(list);
    }
    public static void listTest(ArrayList<String> list){
        if(list.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
