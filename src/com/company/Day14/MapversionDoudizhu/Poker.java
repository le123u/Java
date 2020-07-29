package com.company.Day14.MapversionDoudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker {
    public static void main(String[] args) {
        // 创建map
        HashMap<Integer, String > pokerMap = new HashMap<>();

        // 花色和数字
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        Collections.addAll(colors,"♥","♦","♠","♣");
        Collections.addAll(numbers,"2","3","4","5",
                "6","7","8","9","10","J","Q","K","A");

        int count = 1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");

        // 初始化其他牌
        for(String color:colors){
            for(String number:numbers){
              String card =   color + number;
              pokerMap.put(count++,card);

            }
        }

        // 打乱顺序
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);

        // 创建三个玩家 底牌 编号集合
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> diPaiNo = new ArrayList<>();

        // 不发牌 发编号
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i >= 51){
                diPaiNo.add(no);
            }else{
                if (i % 3 == 0){
                    noP1.add(no);
                }else if (i % 3 == 1){
                    noP2.add(no);
                }else{
                    noP3.add(no);
                }
            }
        }

        // 对手中编号进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(diPaiNo);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        // 遍历
        for (Integer i : noP1){
            String card = pokerMap.get(i);
            player1.add(card);
        }
        for (Integer i : noP2){
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (Integer i : noP3){
            String card = pokerMap.get(i);
            player3.add(card);
        }for (Integer i : diPaiNo){
            String card = pokerMap.get(i);
            dipai.add(card);
        }

        System.out.println("玩家一的牌：" + player1);
        System.out.println("玩家二的牌：" + player2);
        System.out.println("玩家三的牌：" + player3);
        System.out.println("底牌：" + dipai);

    }
}
