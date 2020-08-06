package com.company.neibulei.NeiBuLei02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建Student 对象
        Student s = new Student("小红");
        Student s2 = new Student("小亮");
        Student s3 = new Student("小明");
// 创建 ArrayList
        ArrayList<Student> sList = new ArrayList<>();
        sList.add(s);
        sList.add(s2);
        sList.add(s3);
        Teacher t = new Teacher("张老师");
        Class course = new Class("Java", t, sList);
        t.dianMing(sList);
        course.show();
    }
}
