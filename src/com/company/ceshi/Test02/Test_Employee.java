package com.company.ceshi.Test02;

public class Test_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("刘东东");
        employee.setNum(123);
        employee.setJobs("程序员");
        employee.setPrice(10000);

        System.out.println(employee.getJobs()+employee.getName()+employee.getPrice()+employee.getNum());
    }
}
