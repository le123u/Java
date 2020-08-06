package com.company.ceshi.Test04;

public class StaticDemo01 {
    private String name;
    private int age;
    private int sid;

    public static int numberOfStudent = 0;

    public StaticDemo01(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }

    public void show(){
        System.out.println(name + age + sid);
    }
}
