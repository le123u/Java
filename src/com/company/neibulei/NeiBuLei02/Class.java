package com.company.neibulei.NeiBuLei02;

import java.util.ArrayList;

public class Class {
    /**
     * 定义课程类：
     * 属性：课程名称，讲师，学⽣集合。
     * 提供基本的构造⽅法和get⽅法，set⽅法
     * 成员⽅法：show⽅法，打印课程信息，⽼师姓名，学⽣是否上课情况。
     */

    private String name;
    private Teacher t;
    private ArrayList<Student> sList;

    public Class() {
    }

    public Class(String name, Teacher t, ArrayList<Student> sList) {
        this.name = name;
        this.t = t;
        this.sList = sList;
    }

    public void show() {
        System.out.println("课程名称:" + name);
        System.out.println("授课老师:" + t.getName());
        for (int i = 0; i < sList.size(); i++) {
            Student student = sList.get(i);
            String name = student.getName();
            if (student.isCome()) {
                System.out.println("上课: " + name);
            } else {
                System.out.println("旷课: " + name);
            }
        }
    }
}
