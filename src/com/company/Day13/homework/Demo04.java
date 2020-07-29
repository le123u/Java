package com.company.Day13.homework;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<String> al, String s),
 * 要求使用contains()方法判断al集合里面是否包含s。
 */
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("s");
        list.add("S");
        list.add("a");

        listTest(list,"s");
    }
    public static void listTest(ArrayList<String> list, String s){
       if (list.contains(s)){
           System.out.println(true);
       }else {
           System.out.println(false);
       }

    }
}
