package com.company.revise.luan.demo09;

public class d {
    public static void main(String[] args) {
        String a ="aaa";
        String b = "aaa";
        String c = "Aaa";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.length());

        String aa = a.concat("aa");
        System.out.println(aa);

        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            System.out.println(c1);
        }

        int i = c.indexOf("a");
        System.out.println(i);

        String substring = a.substring(0, 2);
        System.out.println(substring);

        char[] chars = a.toCharArray();
        for (int i1 = 0; i1 < chars.length; i1++) {
            System.out.println(chars[i]);
        }

        String replace = c.replace('A', 'a');
        System.out.println(replace);

        String[] split = c.split("");
        for (int i1 = 0; i1 < split.length; i1++) {
            System.out.println(split[i1]);
        }
    }
}
