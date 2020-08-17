package com.company.revise.Day05;

public class Test_JavaBean {
    public static void main(String[] args) {
        StudentJavaBean javaBean = new StudentJavaBean("刘东东", 18);
        System.out.println(javaBean.getName()+javaBean.getAge());
    }
}
