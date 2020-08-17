package com.company.revise.Day04;

public class Demo01 {
    public static void main(String[] args) {

        int[] arr = new int[]{10,4,2,29};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
