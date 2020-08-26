package com.company.chongchongchong;

import java.util.Scanner;

//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
//程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，
// 插入后此元素之后的数，依次后移一个位置。
public class Demo30 {
    public static void main(String[] args) {
        // 思路：创建2个数组，将输入的数与数组1中的元素比较后，
        // 按规律将输入的数和数组1中的元素赋值给数组2
        int []arr1 = new int[]{1,3,5,7,9,11};
        int []arr2 = new int[arr1.length+1];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int n = 0 ;
        for(int i = 0;i<arr1.length;i++){//找到输入数组在数组的位置
            if(arr1[i]>num) {
                n=i;
                break;
            }else{
                n=arr1.length;
            }
        }
        for(int j = 0;j<arr2.length;j++){//给数组2赋值并输出
            if(j<n){
                arr2[j] = arr1[j];
            }if(j==n){
                arr2[j] = num;
            }if(j>n){
                arr2[j] = arr1[j-1];
            }
            System.out.print(arr2[j] + " ");
        }
    }
}
