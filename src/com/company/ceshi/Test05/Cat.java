package com.company.ceshi.Test05;

public class Cat extends Animal {
    private String name;
    // 无参构造函数
    Cat(){
        super();
        System.out.println("cat()");
    }
    // 有参构造函数
    Cat(String name){
        super();
        this.name = name;
        System.out.println("cat(name)");
    }

    @Override
    public void eat(){
        System.out.println("cat:cat");
    }

    public void eatTest(){
        this.eat();
        super.eat();
    }
}
