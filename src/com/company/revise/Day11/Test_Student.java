package com.company.revise.Day11;

import java.util.HashMap;

public class Test_Student {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("张三",14),"锦州");
        map.put(new Student("lisi",14),"大连");
        map.put(new Student("wangwu",14),"葫芦岛");

        for(Student  key:map.keySet()){
            String s = map.get(key);
            System.out.println(key+s);
        }
    }
}
