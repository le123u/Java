package com.company.revise.luan.demo03;

public class Test {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        studentInfo.setName("aaaa");
        System.out.println(studentInfo.getName());
    }
}
