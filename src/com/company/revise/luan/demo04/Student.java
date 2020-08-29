package com.company.revise.luan.demo04;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参构造方法被调用");

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法被调用");
    }
}
