package com.company.Day13.homework;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，
 * 如"a": 2,"b": 2,"c" :1, "xxx":0。
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }

    public static int listTest(Collection<String> list, String s){
        int count = 0;

        for(String str :list){
            if (str.equals(s)){
                count++;
            }
        }
        return count;
    }

}


