package com.company.revise.Day10;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5};
        int[] desc = new int[]{6,7,8,9,10};
        System.arraycopy(src,0,desc,0,3);
        System.out.println(Arrays.toString(desc));
    }
}
