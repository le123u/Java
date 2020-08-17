package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo01_02 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        Demo01_02 demo01 = new Demo01_02();
        int[] ints = demo01.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }
    public int[] twoSum(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);

        }

        return null;
    }
}
