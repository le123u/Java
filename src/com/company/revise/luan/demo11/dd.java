package com.company.revise.luan.demo11;

import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int[] arr = {2,1,4,36,5,34};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] ints = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(ints));
    }
}
