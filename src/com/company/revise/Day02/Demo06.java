package com.company.revise.Day02;

public class Demo06 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100){
            if (i%2 == 0){
                sum+=i;

            }
            i++;
        }System.out.println(sum);
    }
}
