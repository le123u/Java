package com.company.revise.Day10;

public class Demo06 {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());

        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(l);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
