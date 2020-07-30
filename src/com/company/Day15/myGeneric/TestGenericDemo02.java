package com.company.Day15.myGeneric;

import java.util.ArrayList;

public class TestGenericDemo02 {
    public static void main(String[] args) {
        MyGenericImpl02<String > impl02 = new MyGenericImpl02<>();
        // ArrayList<Object> list = new ArrayList<>();
        impl02.add("hehe");
    }
}
