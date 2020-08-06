package com.company.Day10.Day10_01;

public class Test_Student {
    public static void main(String[] args) {
        Student s1 = new Student("刘东东",18);
        Student s2 = new Student("刘东",18);
        Student s3 = new Student("东",18);
        s1.show();
        s2.show();
        s3.show();
        // 访问类变量
        System.out.println(Student.numberOfStudent);
        // 调用静态方法
        Student.showNum();

    }
}
