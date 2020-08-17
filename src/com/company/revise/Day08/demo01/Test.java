package com.company.revise.Day08.demo01;

import com.company.revise.Day07.demo04.Animal;
import com.company.revise.Day07.demo04.Cat;

public class Test {
    public static void main(String[] args) {
        // 向上转型
       Animal cat = new Cat();
//        cat.eat();

        // 向下转型
        Cat c = (Cat) cat;
        c.eat();
    }
}
