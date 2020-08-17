package com.company.chongchongchong;

import java.util.Scanner;

public class Demo06_02 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个正整数:");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("两个正整数的最大公约数为:"+max(m,n));
        System.out.println("两个正整数的最小公倍数为:"+min(m,n));
    }
    public static int max(int m,int n){
        int k=1;
        for(int i=2;i<=(m>n?n:m);i++)
            if(m%i==0&&n%i==0)
                k=i;
        return k;

    }
    public static int min(int m,int n){
        int j = 0;
        while(true){
            j++;
            if (j%m == 0 && j%n == 0){
                return j;
            }

        }
        // return m*n/max(m,n);
    }
}
