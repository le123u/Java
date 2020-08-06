package com.company.ceshi.Test01;

public class Test_Student {
    public static void main(String[] args) {
        // 调用Student方法
        Student student = new Student();

        // 访问其中的成员变量
        System.out.println("姓名" + student.name);
        System.out.println("年龄" + student.age);

        // 给成员变量赋值
        student.name = "刘东东";
        student.age = 18;

        // 再次输出成员变量
        System.out.println("姓名" + student.name);
        System.out.println("年龄" + student.age);

        // 调用成员方法
        student.study();
        student.eat();

    }
}
