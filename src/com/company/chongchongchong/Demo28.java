package com.company.chongchongchong;
// 题目：对10个数进行排序
public class Demo28 {
    public static void main(String[] args) {
        int[] arr = {2,3,41,5,2,7,34,56,33,89};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }

    }
}
