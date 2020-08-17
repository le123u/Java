package com.company.revise.Day08.demo02;

public class FinalDemo01 {
    public static void main(String[] args) {
        final int al;
        al = 10;
        System.out.println(al);

        for (int i = 0; i < 10; i++) {
            final int c = i;
            System.out.println(c);

        }

    }
}
