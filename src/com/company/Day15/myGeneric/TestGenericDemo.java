package com.company.Day15.myGeneric;

public class TestGenericDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String类
        MyGenericClass<String > my = new MyGenericClass<>();
        my.setMvp("登哥");
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(13);
        Integer mvp1 = my2.getMvp();
        System.out.println(mvp1);
    }
}
