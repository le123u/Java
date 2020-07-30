package com.company.Day14.MapversionDoudizhu;

import java.util.*;

public class Poker01 {
    public static void main(String[] args) {
        // 编号  牌
        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♠","♣");
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,
                "3","4","5","6","7","8","9","10","J","Q","K","A","2");

        int count = 0;


        for(String number:numbers){
            for(String color:colors){
                map.put(count++,color + number);
            }
        }
        map.put(count++ , "大王");
        map.put(count++ , "小王");


        Set<Integer> keySet = map.keySet();
        List<Integer> list = new ArrayList<>();
        list.addAll(keySet);
        Collections.shuffle(list);

        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noDipai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer index = list.get(i);
            if (i >= 51){
                noDipai.add(index);
            }else{
                if (i % 3 == 0){
                    noP1.add(index);
                }else if (i % 3 == 1){
                    noP2.add(index);
                }else{
                    noP3.add(index);
                }
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

        for (Integer a:noP1) {
            player1.add(map.get(a));
        }
        for (Integer b:noP2) {
            player2.add(map.get(b));
        }
        for (Integer c:noP3) {
            player3.add(map.get(c));
        }
        for (Integer d:noDipai) {
            dipai.add(map.get(d));
        }

        System.out.println("玩家一的牌：" + player1);
        System.out.println("玩家二的牌：" + player2);
        System.out.println("玩家三的牌：" + player3);
        System.out.println("底牌：" + dipai);
    }
}
