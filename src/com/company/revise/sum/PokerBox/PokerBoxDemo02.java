package com.company.revise.sum.PokerBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class PokerBoxDemo02 {
    public static void main(String[] args) {
        HashMap<Integer, String> box = new HashMap<>();

        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♠","♣");
        ArrayList<String> number = new ArrayList<>();
        Collections.addAll(number,"3","4","5","6","7","8"
        ,"9","10","J","Q","K","A","2");

        int count = 1;
        for(String num:number){
            for(String color:colors){
                box.put(count++,num+color);
            }
        }
        box.put(count++,"大王");
        box.put(count++,"小王");


        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> integers = box.keySet();
        list.addAll(integers);
        Collections.shuffle(list);

        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noP4 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer ii = list.get(i);
            if (i >= 51){
                noP1.add(ii);
            }else if (i % 3 == 0){
                noP2.add(ii);
            }else if (i % 3 == 1){
                noP3.add(ii);
            }else{
                noP4.add(ii);
            }
        }

        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noP4);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> player4 = new ArrayList<>();

        for(Integer p1:noP1){
            String s = box.get(p1);
            player1.add(s);
        }
        for(Integer p2:noP2){
            String s = box.get(p2);
            player2.add(s);
        }
        for(Integer p3:noP3){
            String s = box.get(p3);
            player3.add(s);
        }
        for(Integer p4:noP4){
            String s = box.get(p4);
            player4.add(s);
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

    }
}
