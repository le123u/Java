package com.company.revise.luan.demo08;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String s1 ="a";
        String s2 ="b";
        String s3 ="c";
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
