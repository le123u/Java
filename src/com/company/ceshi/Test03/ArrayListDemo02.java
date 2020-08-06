package com.company.ceshi.Test03;

import com.company.Test02.StudentJavaBean;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //需求：自定义4个学生对象,添加到集合,并遍历
        ArrayList<StudentJavaBean> list = new ArrayList<>();

        StudentJavaBean s1 = new StudentJavaBean("刘东东", 23);
        StudentJavaBean s2 = new StudentJavaBean("刘东", 24);
        StudentJavaBean s3 = new StudentJavaBean("东", 25);
        StudentJavaBean s4 = new StudentJavaBean("东东", 26);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            StudentJavaBean s = list.get(i);
            System.out.println(s.getName() + s.getAge());
        }
    }
}
