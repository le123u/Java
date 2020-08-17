package com.company.revise.Day09.demo04;

public class SystemClassTest {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
//        System.out.println(l);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        long ll = System.currentTimeMillis();

        System.out.println(ll - l);
    }
}
