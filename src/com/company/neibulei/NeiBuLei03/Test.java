package com.company.neibulei.NeiBuLei03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> ulist = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            ulist.add(new User(i));
        }

        System.out.println("未分组:");
        System.out.println(ulist);

        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        r1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getUserId() >= 10 && u.getUserId() < 20)
                    u.setUserType("v1");
            }
        });

        r2.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getUserId() >= 20 && u.getUserId() < 30)
                    u.setUserType("v2");
            }
        });

        for (int i = 0; i < ulist.size(); i++) {
            User user = ulist.get(i);
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }
        System.out.println("已分组:");
        for (int i = 0; i < ulist.size(); i++) {
            User user = ulist.get(i);
            if (i % 9 == 0) {
                System.out.println();
            }
            System.out.print(user + " ");
        }
    }
}
