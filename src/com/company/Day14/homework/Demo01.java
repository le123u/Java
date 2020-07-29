package com.company.Day14.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        // 请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
        HashMap<String, Integer> map = new HashMap<>();

        // 添加元素
        map.put("鸡哥",001);
        map.put("王八",002);
        map.put("二狗",003);
        map.put("狗蛋",004);

        // 根据键删除
        map.remove("鸡哥");

        // 根据键获取值
        System.out.println(map.get("二狗"));

        System.out.println(map);

        // 是否包含
        boolean b = map.containsKey("狗蛋");
        System.out.println(b);

        // 获取所有的键
        Set<String> keySet = map.keySet();
       for(String key:keySet){

//           Integer val = map.get(key);
           System.out.println(key);
       }

       // 返回键值对
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
       for(Map.Entry<String, Integer> entry:entrySet){
           String key = entry.getKey();
           Integer value = entry.getValue();

           System.out.println(key + "=" + value);
       }

    }
}
