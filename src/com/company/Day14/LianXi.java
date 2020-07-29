package com.company.Day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LianXi {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // 添加
        map.put("苹果","iphone12");
        map.put("华为","Mate30");
        map.put("Vivo","X60");
        map.put("Oppo","Reno3");

        // 判断
        map.containsKey("华为");

        // 访问
        map.get("苹果");

        // 删除
        map.remove("vivo");

        // 获取所有的键
        Set<String> keySet = map.keySet();

        for(String key:keySet){
            String s = map.get(key);
            System.out.println(s);
        }
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
