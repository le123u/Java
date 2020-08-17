package com.company.revise.Day06;

public class Demo04 {

    private String name;
    private int age;
    private int sid;

    public static int numberOfStudent = 0;

    public Demo04(String name,int age){
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }
    public void show(){
        System.out.println(sid+name+age);
    }
}
