package com.company.ceshi.Test04;

public class StringDemo02 {
    public static void main(String[] args) {
        //需求：定义一个方法 把数组{1，2，3}按照[word1#word2#word3]的格式
        // 拼接成一个字符串
        int[] arr = {1,2,3};
        String s = listToString(arr);
        System.out.println(s);
    }
    public static String listToString(int[] arr){
        String s = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                s = s.concat(arr[i]+"]");
            }else{
                s = s.concat(arr[i]+"#");
            }
        }
        return s;

    }
}
