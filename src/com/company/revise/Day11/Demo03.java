package com.company.revise.Day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("aa","bb");
        map.put("cc","dd");
        map.put("ee","ff");
        map.put("gg","hh");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }
    }
}
