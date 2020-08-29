package com.company.revise.luan.demo08;

import java.util.ArrayList;

public class dd {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student a = new Student("a", 1);
        Student b = new Student("a", 1);
        Student c = new Student("a", 1);
        students.add(a);
        students.add(b);
        students.add(c);
        System.out.print("{");
        for (int i = 0; i < students.size(); i++) {

            if (i != students.size()-1){
                System.out.print(students.get(i).getName()+"@");
            }else{
                System.out.print(students.get(i).getName()+"}");
            }
        }
    }
}
