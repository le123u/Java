package com.company.revise.luan.demo15.demo01;

public class Test {
    public static void main(String[] args) {
      final  User user = new User();
        System.out.println(user.getName());
        user.setName("aa");
        System.out.println(user.getName());

    }
}
