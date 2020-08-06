package com.company.ceshi.Test02;

public class Test_StudentJavaBean {
    public static void main(String[] args) {
        StudentJavaBean studentJavaBean = new StudentJavaBean();

        studentJavaBean.setName("刘东东");
        studentJavaBean.setAge(18);

        System.out.println(studentJavaBean.getName()+"------"+studentJavaBean.getAge());
    }


}
