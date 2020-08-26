package com.company.chongchongchong;

// 题目：利用递归方法求5!。
//程序分析：递归公式：fn=fn_1*4!
public class Demo22 {
    public static void main(String[] args) {
        System.out.println(fn(5));

    }
    public static int  fn(int n){
        if (n == 1){
            return 1;
        }else{
            return fn(n-1)*n;
        }
    }
}
