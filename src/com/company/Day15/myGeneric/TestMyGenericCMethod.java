package com.company.Day15.myGeneric;

public class TestMyGenericCMethod {
    public static void main(String[] args) {
        MyGenericCMethod mgm = new MyGenericCMethod();
        // 再调用方法的时候就确定了泛型的类型
        mgm.show("aaa");
        mgm.show(123);
        mgm.show(12.45);



    }
}
