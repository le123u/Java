package com.company.Day13.StringBuffer;

public class TestStringBuffer01 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        System.out.println(buffer);
        StringBuffer buffer1 = new StringBuffer("hello");
        System.out.println(buffer1);

        buffer.append("hhhh");
        buffer.append("world");
        buffer.append(true);
        buffer.append(1000);

        System.out.println(buffer);

    }
}
