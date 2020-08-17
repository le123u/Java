package com.company.revise.Day04;

public class Demo04 {
    public static void main(String[] args) {
        int[] ints = printArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] printArray(){
        int[] arr = {1,2,3,4,5};
        return arr;
    }
}
