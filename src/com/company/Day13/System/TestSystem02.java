package com.company.Day13.System;

public class TestSystem02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("耗时" + (end - start));
    }
}
