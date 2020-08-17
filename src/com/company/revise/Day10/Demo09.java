package com.company.revise.Day10;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo09 {
    public static void main(String[] args) {
        ArrayList<Object> coll = new ArrayList<>();

        coll.add("aa");
        coll.add("bb");
        coll.add("cc");

        Iterator<Object> iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
