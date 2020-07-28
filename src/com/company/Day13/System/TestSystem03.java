package com.company.Day13.System;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSystem03 {
    public static void main(String[] args) {
        // 将src中前三个元素复制到dest的前三个位置上 复制元素前
        // 操作后[1，2，3，4，5]  [1，2，3，9，10]
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
