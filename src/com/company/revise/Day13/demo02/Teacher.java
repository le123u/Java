package com.company.revise.Day13.demo02;

public class Teacher extends Person {

    private String kind;

    public Teacher() {

    }

    public Teacher(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void showMethod(){
        System.out.println(getName()+"老师，讲授"+kind+"课");

    }
}
