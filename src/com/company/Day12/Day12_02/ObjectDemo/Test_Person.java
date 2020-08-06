package com.company.Day12.Day12_02.ObjectDemo;

import com.company.Day12_02.ObjectDemo.Person;

public class Test_Person {
    public static void main(String[] args) {
        Person p1 = new Person("张三",111);
        Person p2 = new Person("张三",111);
        Person p3 = new Person("张三",121);
        // com.company.Day12_02.ObjectDemo.Person@75412c2f
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}
