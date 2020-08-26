package com.company.revise.Day14.demo03;

public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        System.out.println("========================");

        Universe universe = new Sun();
        universe.doAnything();

        Sun sun = (Sun) universe;
        sun.shine();
    }
}
