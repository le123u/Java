package com.company.revise.Day08.demo02;

import com.company.revise.Day01.User;

public class FinalDemo02 {
    public static void main(String[] args) {
       final User user1 = new User();

        System.out.println(user1.getName());

        user1.setName("李四");
        System.out.println(user1.getName());
    }
}
