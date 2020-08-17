package com.company.revise.Day11;

import java.util.HashMap;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("aa","bb");
        map.put("cc","dd");
        map.put("ee","ff");
        map.put("gg","hh");

        Set<String> set = map.keySet();
       for(String s:set){
           String s1 = map.get(s);
           System.out.println(s+s1);
       }
    }
}
