package com.company.revise.Day05;

public class StudentJavaBean {
    private String name;
    private int age;

    public StudentJavaBean(){

    }
    public StudentJavaBean(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
