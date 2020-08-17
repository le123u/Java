package com.company.chongchongchong;

public class Demo02_02 {
    public static void main(String[] args) {
        int m = 101;
        int n = 200;
        int count = 0;
        for (int i = m; i <= n ; i++) {
            if (isPrime(i)){
                count++;
                System.out.println(i+"");
                if (count%10 == 0){
                    System.out.println();
                }
            }

        }
        System.out.println();
        System.out.println("在"+m+"和"+n+"之间"+"共有"+count+"个素数");
    }
    private static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1) {
            flag = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if ((n % i == 0) || n == 1) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }

        return flag;
    }}
