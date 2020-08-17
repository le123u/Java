package com.company.revise.Day06;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        int[] list = {1,2,3};


        printArray(list);

    }
    public static void printArray(int[] list){
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            Integer integer = list[i];
            if (i != list.length - 1){
                System.out.print(integer+"#");
            }else{
                System.out.print(integer+"]");
            }
        }
//        int arr[][] = new int[10][10];
//        int []arr1[] = new int[10][10];
        //String   a[]=new   String[5]；for(int   i=0；i<5；a[i++]=“”)；
        String a[] = new String[5];
        for (int i = 0; i < 5; i++) {
            a[i] ="";
            System.out.println(a[i]);
        }

    }
}
