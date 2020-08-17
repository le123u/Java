package com.company.revise.Day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 200);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money = scanner.nextInt();

        System.out.println("请输入红包数量：");
        int count = scanner.nextInt();


        ArrayList<Integer> list = manage.send(money, count);

        one.receive(list);
        two.receive(list);
        three.receive(list);

        manage.show();
        one.show();
        two.show();
        three.show();
    }
}
