package com.company.revise.Day10;

import java.util.ArrayList;

public class Demo08 {
    public static void main(String[] args) {
        ArrayList<Object> coll = new ArrayList<>();

        coll.add("aa");
        coll.add("bb");
        coll.add("cc");

        System.out.println(coll.contains("cc"));

        System.out.println(coll.remove("aa"));

        System.out.println(coll.isEmpty());

        System.out.println(coll.size());

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {

            System.out.println(objects[i]);
        }

        coll.clear();
        System.out.println(coll);
    }
}
