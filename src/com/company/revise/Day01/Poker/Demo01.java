package com.company.revise.Day01.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♣","♠");
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"3","4","5","6","7","8","9","10"
        ,"J","Q","K","A","2");

        int count = 1;
        for(String number:numbers){
            for(String color:colors){
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
        ArrayList<Integer> noDipai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= 51){
                noP1.add(list.get(i));
            }else if (i % 3 == 0){
                noP2.add(list.get(i));
            }else if (i % 3 == 1){
                noP3.add(list.get(i));
            }else{
                noDipai.add(list.get(i));
            }
        }

        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noDipai);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(Integer a:noP1){
            player1.add(map.get(a));
        }
        for(Integer b:noP2){
            player2.add(map.get(b));
        }
        for(Integer c:noP3){
            player3.add(map.get(c));
        }
        for(Integer d:noDipai){
            dipai.add(map.get(d));
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
