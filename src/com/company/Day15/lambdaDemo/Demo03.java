package com.company.Day15.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("张三", 12),
                new Person("李四", 18),
                new Person("王五", 10),
                new Person("赵六", 15)

        };
        Comparator<Person> comp = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

        Arrays.sort(array, comp);
        
        for(Person person : array){
            System.out.println(person);
        }
    }

}
