package com.company.revise.luan.demo17;

public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
