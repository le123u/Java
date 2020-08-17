package com.company.revise.Day05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo02 {
    public static void main(String[] args) {

        ArrayList<StudentJavaBean> list = new ArrayList<>();

        StudentJavaBean student1 = new StudentJavaBean("ldd", 12);
        StudentJavaBean student2 = new StudentJavaBean("ld", 14);
        StudentJavaBean student3 = new StudentJavaBean("dd", 16);
        StudentJavaBean student4 = new StudentJavaBean("d", 18);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
