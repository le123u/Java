package com.company.chongchongchong;
// 题目：将一个数组逆序输出。
public class Demo31 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
//        for (int min = 0,max = arr.length-1;min < max;min++,max--){
//            int temp = arr[min];
//            arr[min] = arr[max];
//            arr[max] = temp;
//        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
