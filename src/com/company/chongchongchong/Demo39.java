package com.company.chongchongchong;

import java.util.Scanner;

// 题目：编写一个函数，
// 输入n为偶数时，调用函数求1/2+1/4+...+1/n,
// 当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
public class Demo39 {
   public static void main(String[] args) {
//        System.out.println("请输入一个数");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(nnn(n));
//    }
//    public static double nnn(int n){
//        double result = 0;
//        if(n % 2==0 ) {
//            for(int i = 2; i < n+2; i+=2) {
//                result += 1.0/i;
//            }
//            return result;
//        } else {
//            //计算奇数数列的和
//            for(int j = 1; j < n+2; j+=2) {
//                result += 1.0/j;
//            }
//            return result;
//        }

       System.out.print("请输入一个整数：");
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.close();
       if(n%2==0)
           System.out.println("结果："+even(n));
       else
           System.out.println("结果："+odd(n));
   }
    //奇数
    public static double odd(int n){
        double sum = 0;
        for(int i=1;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
    //偶数
    public static double even(int n){
        double sum = 0;
        for(int i=2;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
}

