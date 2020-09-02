package com.company.revise.luan.demo14.demo02;

import com.company.revise.luan.demo14.demo01.Animal;
import com.company.revise.luan.demo14.demo01.Cat;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();

        Cat c = (Cat) cat;
        c.eat();
    }
}
