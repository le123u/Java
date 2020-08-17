package com.company.revise.Day05;

public class EmpJavaBean {
    // 员工姓名
    private String name;
    // 工号
    private int age;
    // 职位
    private String emp;
    // 薪资
    private int sal;

    public EmpJavaBean(){

    }

    public EmpJavaBean(String name, int age, String emp, int sal) {
        this.name = name;
        this.age = age;
        this.emp = emp;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
