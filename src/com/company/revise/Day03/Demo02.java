package com.company.revise.Day03;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 10; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
