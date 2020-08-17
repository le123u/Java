package com.company.revise.Day05;

public class Text_EmpJavaBean {
    public static void main(String[] args) {
        EmpJavaBean empJavaBean = new EmpJavaBean("ldd", 18, "llll", 1111111);
        System.out.println(empJavaBean.getName()+empJavaBean.getAge()+empJavaBean.getEmp()+empJavaBean.getSal());
    }
}
