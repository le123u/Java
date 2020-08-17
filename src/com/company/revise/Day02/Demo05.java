package com.company.revise.Day02;

public class Demo05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            count++;
            if (count%6 == 0){
                System.out.println();
            }


        }
    }
}
