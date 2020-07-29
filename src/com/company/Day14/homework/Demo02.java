package com.company.Day14.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        // 往一个Map集合中添加若干元素。获取Map中的所有value，
        // 并使用增强for和迭代器遍历输出每个value。
        HashMap<String, Integer> map = new HashMap<>();
        // 添加元素
        map.put("鸡哥",001);
        map.put("王八",002);
        map.put("二狗",003);
        map.put("狗蛋",004);

        // 获取map中的所有value
        Collection<Integer> values = map.values();
        System.out.println(values);

        // 使用增强for循环获取
        for (Integer value:values) {
            System.out.println(value);

        }

        // 使用迭代器遍历输出values
        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
