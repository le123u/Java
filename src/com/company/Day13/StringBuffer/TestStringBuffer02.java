package com.company.Day13.StringBuffer;

public class TestStringBuffer02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELLO").append("world").append("java");
        String str = sb.toString();
        System.out.println(str);
    }

}
