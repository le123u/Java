package com.company.chongchongchong;
// 题目：字符串排序。
public class Demo40 {
    public static void main(String[] args) {
        String[] str = new String[]{"abc", "cad", "m", "fa", "f"};
        for (int i=0; i<str.length; i++) {
            for (int j=0; j<str.length-i-1; j++) {
                if(str[j].compareTo(str[j+1]) < 0) {
                    String strTemp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = strTemp;
                }
            }
        }
        for (String s: str)
            System.out.print(s+" ");

    }
}
