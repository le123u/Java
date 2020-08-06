package com.company.ceshi.Test04;

public class Test_StaticDemo01 {
    public static void main(String[] args) {
        StaticDemo01 s1 = new StaticDemo01("ldd", 23);
        StaticDemo01 s2 = new StaticDemo01("ld", 23);
        StaticDemo01 s3 = new StaticDemo01("dd", 23);
        StaticDemo01 s4 = new StaticDemo01("d", 23);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}
