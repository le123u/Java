package com.company.leetcode;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] num = new int[]{2,7,11,15};
        int target = 9;
        Demo01 demo01 = new Demo01();
        int[] ints = demo01.toSum(num, target);
        System.out.println(Arrays.toString(ints));

    }
    public int[]  toSum(int[] num,int target){
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
