package com.company.chongchongchong;

// 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
public class Demo35 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = i;
            }
            if (arr[i]>max){
                max = i;
            }
        }
//        System.out.println(max);
//        System.out.println(min);
        int temp1 = arr[max];
        arr[max] = arr[0];
        arr[0] = arr[max];

        int temp2 = arr[min];
        arr[min] = arr[arr.length-1];
        arr[arr.length-1] =arr[min];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
