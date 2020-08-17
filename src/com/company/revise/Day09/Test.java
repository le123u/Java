package com.company.revise.Day09;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        Person.Heart heart = person.new Heart();
        heart.jump();

        boolean live = person.isLive();
        System.out.println(live);

        person.setLive(false);
        heart.jump();
    }
}
