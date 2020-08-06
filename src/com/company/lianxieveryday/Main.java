package com.company.lianxieveryday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // 创建一个map集合存放扑克牌
        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♣","♠");
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"3","4","5","6","7","8","9","10",
                "J","Q","K","A","2");

        int count = 1;
        for(String number:numbers){
            for (String color:colors){
                String s = color + number;
                map.put(count++,s);

            }
        }
        map.put(count++,"大王");
        map.put(count++,"小王");

        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        Collections.shuffle(list);

        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noDiPai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= 51){
                noDiPai.add(list.get(i));
            }else if (i % 3 == 0){
                noP1.add(list.get(i));
            }else if (i % 3 == 1){
                noP2.add(list.get(i));
            }else{
                noP3.add(list.get(i));
            }
        }

        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noDiPai);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (Integer p1:noP1){
            player1.add(map.get(p1));
        }
        for (Integer p2:noP2){
            player2.add(map.get(p2));
        }
        for (Integer p3:noP3){
            player3.add(map.get(p3));
        }
        for (Integer p4:noDiPai){
            dipai.add(map.get(p4));
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

    }
}
