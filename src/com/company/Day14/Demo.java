package com.company.Day14;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        // 创建map对象
        HashMap<String, String> map = new HashMap<>();
        // 添加
        map.put("吕布","貂蝉");
        map.put("孙策","大乔");
        map.put("周瑜","二乔");
        map.put("刘备","甘夫人");
        // 如果put之前存在。那么会覆盖之前的值
        map.put("刘备","孙尚香");
        System.out.println(map);

        // 访问
        String s = map.get("刘备");
        System.out.println(s);

        // 删除
        String s1 = map.remove("孙策");
        System.out.println(s1);

        System.out.println(map.containsKey("刘备"));
    }
}
