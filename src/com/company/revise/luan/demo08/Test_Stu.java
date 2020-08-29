package com.company.revise.luan.demo08;

public class Test_Stu {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("a", 1);
        Student s2 = new Student("b", 2);
        Student s3 = new Student("c", 3);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName()+student.getAge());
        }

    }
}
