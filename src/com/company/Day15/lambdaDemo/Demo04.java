package com.company.Day15.lambdaDemo;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {

        Person[] array = {
                new Person("张三", 12),
                new Person("李四", 18),
                new Person("王五", 10),
                new Person("赵六", 15)

        };
        Arrays.sort(array,(Person a,Person b) ->{
            return a.getAge() - b.getAge();
        });
        for(Person person:array){
            System.out.println(person);
        }
    }
}
