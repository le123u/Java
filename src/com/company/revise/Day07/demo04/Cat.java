package com.company.revise.Day07.demo04;

public class Cat extends Animal {
    private String name;

    public Cat(){
        super();
        System.out.println("cat");
    }
    public Cat(String name){
        super();
        this.name = name;
        System.out.println("Cat(name)");
    }

    @Override
    public void eat(){
        System.out.println("eateateat");
    }

    public void eatTest(){
        this.eat();
        super.eat();
    }

}
