package com.company.Day09.Day09_01.redbag02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Mange mange = new Mange("群主", 200);
        Member member1 = new Member("成员A", 0);
        Member member2 = new Member("成员B", 0);
        Member member3 = new Member("成员B", 0);

        mange.show();
        member1.show();
        member2.show();
        member3.show();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要发的金额：");
        int money = scanner.nextInt();
        System.out.println("请输入发的红包数量：");
        int count = scanner.nextInt();

        ArrayList<Integer> list = mange.send(money, count);
        member1.revise(list);
        member2.revise(list);
        member3.revise(list);

        mange.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
