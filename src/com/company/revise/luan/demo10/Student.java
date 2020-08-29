package com.company.revise.luan.demo10;

public class Student {
    private String name;
    private int age;

    private int sid;

    public static int aa = 0;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++aa;
    }
    public void  show(){
        System.out.println(name+age+sid);
    }
}
