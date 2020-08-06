package com.company.Day10.Day10_01;

import java.util.Arrays;
import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前"+ Arrays.toString(arr));

        Arrays.sort(arr); // 升序
        System.out.println("排序后"+ Arrays.toString(arr));

    }
}
