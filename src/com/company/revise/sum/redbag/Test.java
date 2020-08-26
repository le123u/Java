package com.company.revise.sum.redbag;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 200);
        Member a = new Member("A", 0);
        Member b = new Member("B", 0);
        Member c = new Member("C", 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入发多少钱：");
        int money = scanner.nextInt();

        System.out.println("请输入发多少个包：");
        int count = scanner.nextInt();

        ArrayList<Integer> list = manage.send(count, money);

        a.revise(list);
        b.revise(list);
        c.revise(list);

        manage.show();
        a.show();
        b.show();
        c.show();

    }
}
