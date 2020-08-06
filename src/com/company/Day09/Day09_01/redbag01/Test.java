package com.company.Day09.Day09_01.redbag01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 200);

        Member member1 = new Member("成员A", 0);
        Member member2 = new Member("成员B", 0);
        Member member3 = new Member("成员C", 0);

//        manage.show();
//        member1.show();
//        member2.show();
//        member3.show();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要发的金额：");
        int money = sc.nextInt();
        System.out.println("请输入你要发几个包：");
        int count = sc.nextInt();

        // 调用发红包
        ArrayList<Integer> redList = manage.send(money, count);

        // 调用收红包
        member1.revise(redList);
        member2.revise(redList);
        member3.revise(redList);

        manage.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
