package com.company.ceshi.Test02;

public class Employee {

    // 姓名
    private String name;
    // 工号
    private int num;
    // 岗位
    private String jobs;
    // 薪资
    private int price;

    // 有参、无参构造方法
    public Employee(){

    }
    public Employee(String name,int num,String jobs,int price){
        this.name = name;
        this.num = num;
        this.price = price;
        this.jobs = jobs;
    }


    //set() get() 方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getJobs(){
        return jobs;
    }
    public void setJobs(String jobs){
        this.jobs = jobs;
    }
    public Integer getNum(){
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
