package com.company.revise.Day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next.length());

        }

    }
}
