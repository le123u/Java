package com.company.revise.luan.demo07;

import java.util.Random;

public class d {
    public static void main(String[] args) {
        Random random = new Random();

        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(10);
            System.out.println(i);
        }
    }
}
