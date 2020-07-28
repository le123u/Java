package com.company.Day13;

import java.util.ArrayList;
import java.util.Collection;

public class TestForEach {
    public static void main(String[] args) {
        int[] arr =new int[]{1,4,6,7,8};
        for(int a:arr){
            System.out.println(a);

        }
        Collection<Object> coll = new ArrayList<>();
        coll.add("小鲁班");
        coll.add("安其拉");
        coll.add("后羿");

        for(Object hero: coll){
            System.out.println("当前的英雄是："+hero);
        }


    }
}
