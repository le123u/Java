package com.company.Day14;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {
    public static void main(String[] args) {
        // 创建map对象
        HashMap<Student, String> map = new HashMap<>();

        // 添加元素
        map.put(new Student("zhangsna",14),"锦州");
        map.put(new Student("lisi",15),"葫芦岛");
        map.put(new Student("wangwu",16),"大连");
        map.put(new Student("zhaoliu",17),"营口");

        // 遍历
        for(Student key : map.keySet()){
            String val = map.get(key);
            System.out.println(key+"..........."+val);
        }

    }
}
