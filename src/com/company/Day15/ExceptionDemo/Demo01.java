package com.company.Day15.ExceptionDemo;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        // System.out.println(arr[3]);
        if (1 == 1){
            // throw new NullPointerException("要访问的arr数组不存在");
            throw  new ArrayIndexOutOfBoundsException("数组越界了");
        }
    }
}
