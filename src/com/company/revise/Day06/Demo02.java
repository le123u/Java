package com.company.revise.Day06;

public class Demo02 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";

        // equals方法
        System.out.println(s1.equals(s2));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s2));
        // length()
        System.out.println(s1.length());
        // concat
        String s3 = s1.concat("world");
        System.out.println(s3);
        // charAt
        char c = s1.charAt(0);
        System.out.println(c);
        // indexOf()
        int o = s1.indexOf('o');
        System.out.println(o);
        // substring
        String s5 = s1.substring(0, 5);
        System.out.println(s5);
        // toCharArray
        char[] chars = s2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        // getBytes
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        // replace
        String replace = s1.replace("ll", "LL");
        System.out.println(replace);
        // split
        String ss = "aa,bb,cc";
        String[] split = ss.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }
}
