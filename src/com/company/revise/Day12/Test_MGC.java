package com.company.revise.Day12;

public class Test_MGC {
    public static void main(String[] args) {
        MyGenericClass<String> my = new MyGenericClass<>();
        my.setMvp("登哥");
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(13);
        System.out.println(my2.getMvp());
    }
}
