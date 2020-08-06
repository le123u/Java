package com.company.Day11.Day11_01.InnerClassDemo;

public class Test_Person {
    public static void main(String[] args) {
        Person p = new Person();

        Person.Heart heart = p.new Heart();

       // Person.Heart heart =new Person().new Heart();
        heart.jump();

        p.setLive(false);
        heart.jump();
    }
}
