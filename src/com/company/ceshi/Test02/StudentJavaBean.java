package com.company.ceshi.Test02;

public class StudentJavaBean {

    // 成员变量
    private String name;
    private int age;

    // 无参构造方法必要的 有参构造方法可有可无
    public StudentJavaBean(){

    }
    public StudentJavaBean(String name,int age){
        this.name = name;
        this.age = age;
    }

    //get() set()方法
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
