package com.company.Day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator01 {
    public static void main(String[] args) {

        // 使用多态形式创建集合对象
        Collection<Object> coll = new ArrayList<>();

        coll.add("小鲁班");
        coll.add("安其拉");
        coll.add("后羿");

        // 遍历
        Iterator<Object> iterator = coll.iterator();
        //iterator.hasNext() 判断是否有迭代元素
        while (iterator.hasNext()){
            // 获取迭代的元素
            Object s = iterator.next();
            System.out.println(s);

        }
    }
}
