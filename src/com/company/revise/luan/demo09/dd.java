package com.company.revise.luan.demo09;

public class dd {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        String aa = aa(arr);
        System.out.println(aa);

    }
    public static  String aa(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
                 s = s.concat(arr[i] + "#");
            }else{
                 s = s.concat(arr[i] + "]");
            }
        }

        return s;
    }
}
