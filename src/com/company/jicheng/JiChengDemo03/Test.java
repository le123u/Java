package com.company.jicheng.JiChengDemo03;

public class Test {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("刘东东",20,"Java");
        teacher.showTeacher();

        Student student = new Student("东东",18,100);
        student.method();
    }
}
