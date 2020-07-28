package com.company.Day13.StringBuilder;

public class TestStringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HELLO").append("world").append("java");
        String str = sb.toString();
        System.out.println(str);
    }
}
