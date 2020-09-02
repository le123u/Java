package com.company.revise.luan.demo17;

public class demo1 {
    public static void main(String[] args) {
       //  System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
