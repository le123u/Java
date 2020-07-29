package com.company.Day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","二乔");
        map.put("刘备","甘夫人");
        // 获取所有的entry对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历
        for(Map.Entry<String, String> entry: entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
