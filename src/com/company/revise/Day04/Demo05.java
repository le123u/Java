package com.company.revise.Day04;

public class Demo05 {
    public static void main(String[] args) {
        // 基本数据类型  基本数据类型都在栈中
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a,b);
        System.out.println(a);
        System.out.println(b);

        //  引用数据类型 引用数据类型在堆中
        int[] arr = {1,3,5};
        System.out.println(arr[0]);
        change2(arr);
        System.out.println(arr[0]);
    }
    public static void change(int a , int b) {
        a =  a + b ;
        b = b + a;
    }
    public static void change2(int[] arr) {
        arr[0] = 200;


    }
}
