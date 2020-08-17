package com.company.revise.Day11;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("aa","bb");
        map.put("cc","dd");
        map.put("ee","ff");
        map.put("gg","hh");

//        map.put("gg","rr"); //会覆盖
//        System.out.println(map);

        String aa = map.get("aa");
        System.out.println(aa);

        String s1 = map.remove("cc");
        System.out.println(s1);

        System.out.println(map.containsKey("cc"));
    }
}
