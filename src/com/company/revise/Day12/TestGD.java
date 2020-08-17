package com.company.revise.Day12;

import java.util.ArrayList;
import java.util.Collection;

public class TestGD {
    public static void main(String[] args) {
       Collection<Integer> list1 = new ArrayList<>();
       Collection<String> list2 = new ArrayList<>();
       Collection<Number> list3 = new ArrayList<>();
       Collection<Object> list4 = new ArrayList<>();

       getElemnent1(list1);
//       getElemnent1(list2);
       getElemnent1(list3);
//       getElemnent1(list4);

//        getElement1(list1);
//       getElement1(list2);
        getElement2(list3);
      getElement2(list4);

    }
    public static void getElemnent1(Collection<? extends Number> coll){

    }

    public static void getElement2(Collection<? super Number> coll){

    }
}
