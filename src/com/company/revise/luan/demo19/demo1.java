package com.company.revise.luan.demo19;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,8};
        int[] dest = new int[]{6,7,8,9};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
