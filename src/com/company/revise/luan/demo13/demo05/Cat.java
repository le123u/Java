package com.company.revise.luan.demo13.demo05;

public class Cat extends Animal {

    private String name;
    public Cat(){
        super();
        System.out.println("cat");
    }
    public Cat(String name){
        this.name = name;
        System.out.println("Cat(name)"+name);
    }
    @Override
    public void eat(){
        System.out.println("cat:eat");
    }
    public void eatTest(){
        this.eat();
        super.eat();
    }
}
